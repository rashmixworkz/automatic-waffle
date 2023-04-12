package com.xworkz.finalProject.service;

import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.xworkz.finalProject.dto.SingUp;
import com.xworkz.finalProject.entity.SignUpEntity;
import com.xworkz.finalProject.repository.SignUpRepo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SignUpServiceImpl implements SignUpService {

	@Autowired
	private SignUpRepo signuprepo;

	@Autowired
	private PasswordEncoder passwordEncoder;

	private Set<ConstraintViolation<SingUp>> validate(SingUp singUp) {
		ValidatorFactory ValidatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = ValidatorFactory.getValidator();
		Set<ConstraintViolation<SingUp>> violation = validator.validate(singUp);
		return violation;
	}

	@Override
	public Set<ConstraintViolation<SingUp>> validateAndSave(SingUp signDTO) {
		log.info("Running validateAndSave in serviceImpli");
		Long user = this.signuprepo.findByUser(signDTO.getUserId());
		Long mail = this.signuprepo.findByEmaiId(signDTO.getEmail());
		Long mobile = this.signuprepo.findByMobileNo(mail);
		log.error("userCount" + user);
		log.error("mailCount" + mail);
		log.error("mobileCount" + mobile);

		Set<ConstraintViolation<SingUp>> violations = validate(signDTO);
		if (violations != null && !violations.isEmpty()) {
			log.info("violations is there in Dto unable to procced to next");
			return violations;
		}
		if (!signDTO.getPassword().equals(signDTO.getConfirmPassword())) {
			return null;
		}
		if (user == 0 && mail == 0 && mobile == 0) {
			log.info("No violations in Dto can proceed to next");
			log.error("userCount" + user);
			log.error("mailCount" + mail);
			log.error("mobileCount" + mobile);
			SignUpEntity signUpEntity = new SignUpEntity();
			signUpEntity.setCreatedBy(signDTO.getUserId());
			signUpEntity.setCreatedDate(LocalDateTime.now());
			signUpEntity.setUserId(signDTO.getUserId());
			signUpEntity.setEmail(signDTO.getEmail());
			signUpEntity.setMobile(signDTO.getMobile());
			signUpEntity.setConfirmPassword(passwordEncoder.encode(signDTO.getConfirmPassword()));
			signUpEntity.setPassword(passwordEncoder.encode(signDTO.getPassword()));

//			BeanUtils.copyProperties(signDTO, signUpEntity);

			boolean saved = this.signuprepo.save(signUpEntity);
			log.info("Saved in serviceImpl" + saved);
		} else {
			return null;
		}
		return Collections.emptySet();
	}

	@Override
	public List<SingUp> findAll() {
		List<SignUpEntity> listEntity = this.signuprepo.findAll();
		List<SingUp> list = new ArrayList<SingUp>();
		for (SignUpEntity entity : listEntity) {
			SingUp signUpDto = new SingUp();
			BeanUtils.copyProperties(entity, signUpDto);
			list.add(signUpDto);
		}
		return list;
	}

	@Override
	public Long findByUser(String userId) {
		Long userCounts = this.signuprepo.findByUser(userId);
		return userCounts;
	}

	@Override
	public Long findByEmaiId(String email) {
		Long emailCounts = this.signuprepo.findByEmaiId(email);
		return emailCounts;
	}

	@Override
	public Long findByMobileNo(Long mobile) {
		Long mobileCounts = this.signuprepo.findByMobileNo(mobile);
		return mobileCounts;
	}

	@Override
	public SingUp signIn(String userId, String password) {
		log.info("Ruuning signIn in serviceImpl");
		SignUpEntity entity1 = this.signuprepo.signIn(userId);
		SingUp singUpDto = new SingUp();
		/*
		 * singUpDto.setUserId(entity1.getUserId());
		 * singUpDto.setPassword(entity1.getPassword());
		 * singUpDto.setConfirmPassword(entity1.getConfirmPassword());
		 */
		BeanUtils.copyProperties(entity1, singUpDto);

		log.info("matching...." + passwordEncoder.matches(password, entity1.getPassword()));
		if (entity1.getCount() >= 3) {
			log.info("Running count attempts--" + entity1.getCount());
			return singUpDto;
		}

		if (singUpDto.getUserId().equals(userId) && passwordEncoder.matches(password, entity1.getPassword())) {
			log.info("Running in password matching");
			return singUpDto;
		} else {
			this.signuprepo.loginCount(userId, entity1.getCount() + 1);
			log.info("Number of login attempts" + entity1.getCount() + 1);
			return null;
		}

	}

	/*
	 * @Override public SingUp resetPassword(String email) { // TODO Auto-generated
	 * method stub return SignUpService.super.resetPassword(email); }
	 */

	/*
	 * @Override public boolean sendEmail(String email) {
	 * 
	 * String portNumber = "587"; String hostName = "smtp.office365.com"; final
	 * String fromEmail = "rashmidesai10@outlook.com"; final String fromPassword =
	 * "kohlapurMahalaxmi"; String to = email;
	 * 
	 * Properties prop = new Properties(); prop.put("mail.smtp.host", hostName);
	 * prop.put("mail.smtp.port", portNumber); prop.put("mail.smtp.starttls.enable",
	 * "true"); prop.put("mail.debug", true); prop.put("mail.smtp.auth", true);
	 * prop.put("mail.transport.protocol", "smtp");
	 * 
	 * Session session = Session.getInstance(prop, new Authenticator() {
	 * 
	 * @Override protected PasswordAuthentication getPasswordAuthentication() {
	 * return new PasswordAuthentication(fromEmail, fromPassword); }
	 * 
	 * });
	 * 
	 * MimeMessage msg = new MimeMessage(session); try { msg.setFrom(new
	 * InternetAddress(fromEmail)); msg.setSubject("Registration Completed");
	 * msg.setText("Thank you for Registering!!!!");
	 * 
	 * msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	 * Transport.send(msg); System.out.println("Mail sent succesfully");
	 * 
	 * } catch (MessagingException e) { e.printStackTrace(); }
	 * 
	 * return true;
	 * 
	 * }
	 */
}