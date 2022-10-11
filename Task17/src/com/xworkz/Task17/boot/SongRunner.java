package com.xworkz.Task17.boot;

import com.xworkz.Task17.things.Song;

public class SongRunner {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Song music=new Song();
		System.out.println("song name is:"+music.name);
		System.out.println("language is:"+music.language);
		System.out.println("singer name:"+music.singer);
		System.out.println("song writter:"+music.lyricst);
		System.out.println("type of the song:"+music.type);
		music.name="Tunturu alli neera haadu";
		music.language="Kannada";
		music.singer="K.S Chitra";
		music.lyricst="k.kalyan";
		music.type="film song";
		System.out.println("song name is:"+music.name);
		System.out.println("language is:"+music.language);
		System.out.println("singer name:"+music.singer);
		System.out.println("song writter:"+music.lyricst);
		System.out.println("type of the song:"+music.type);
	}

}
