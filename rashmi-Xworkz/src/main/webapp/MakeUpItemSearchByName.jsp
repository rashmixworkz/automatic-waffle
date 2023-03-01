<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
</head>
<body>

	<nav class="navbar navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img
				src="data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAoHCBUVFBgVFBUYGRgaGxodGhkaGx0aHB0bGhoaGhoYGhggIC0kGyApIBoZJTclKS4wNDQ0IyM5PzkyPi0yNDABCwsLEA8QHhISHjIpIysyMjIyNTIyMjIwMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMjIyMv/AABEIALcBEwMBIgACEQEDEQH/xAAcAAABBQEBAQAAAAAAAAAAAAAGAAMEBQcBAgj/xABGEAACAQIDBgQCBwYFAgQHAAABAgMAEQQSIQUGMUFRYRMicYEykQdCUnKhscEUI2LR4fAzgpKi8bLCFUNjcxYkRFOT0tP/xAAZAQADAQEBAAAAAAAAAAAAAAAAAQIDBAX/xAAkEQACAgICAgMAAwEAAAAAAAAAAQIRAyESMQRBIlFhExRxkf/aAAwDAQACEQMRAD8As5ZGmcIgJF/KPtH7R6D/AJq/hiXDp4aEGRgM79OgH6D3PKp+AwEcTMyjVuZ1sPsjoKjY/BFCWFypJJPMFjc37a8eVcyg4q/Z1c1KVPohUq7anIYS7ZV+fQdTWfZu3R3DYcyNYe56CrTICPDTRBoT9o8xf8z7UkQKPDTgPjbnfp6/kKeDACwHyreEKOXJPkyj3o2L+0wNGDlNwyHkGXhftyrH8fhHztHIuSVOI69xW8O/ahfezYCYpMy2WVPgfr/A3b8vnfRaI7B7crewkjDznzjRHP1v4Sevfn+ekxSAisGxWFYsyspSVD5l4G45ijbcne4sRBObONFY/XHQ/wAX5+vFsDSK7TUUgIp0UAK9eHkA411zaoiLnNzwHAdaiUqHGNnv9pJ+FSR14VwzSDinyP6U9SqOTNOKG4sUDpwPQ1IBqNPDmHfkaWDluLHiONXGVkSjW0Sq4a7SqyTldryaQagD0a8E113ApoyCgBM9NvJTU8wHbvWe7d3yk8QpAQEU6txLWOoB+qPxqGzfFhlkdIOcTjgunFvsjU/09TUFy8nxHKv2VP8A1Nx9hb3prZuISWNZI+Di9ud+YPcGrBIev9+9YOUpOkafxqHZHjjA0UfLhT8mEDL5v+DypxDyQX78v608mH5sbn8PYVUMftkSyekMYW9h20vrU9KSpXa3MWJ5LVGhJVr5jrybgfQ9aebWvOTTtTJHfGXrXKa8I9fmP612gCwrgOXQ6r87f0pEkd69Ag0gKzE7NN7x2Kn6t7Ze4P2e3Ll0EhEyDw0+I/E3T+vQe/rJZWAOUj35d/6U2ihdNe5Otz1NRxSdlcm1TEiAAKOFSkjApiOpIFaIzZxkBqBi8NzFWLU1JwpgmAm8u7YxAzpZZkHlbr/Ax6dDyrN8XhmLEEFJUPmXgbjmK3FE8x0qg3t3YGIXxIyEmUeVvtD7DfoeVTdFNWVG5G9niWhmNpBwY/XA/wC7860KJwRWYbG3fQqzyBkxStb/ANvRCkiKARJ5pEBvoNeV7luztqHN4UoySC+nBWANsyHnyuOIv6EptDSL3EnymuQiyj0H9a8s+Za7AfKO2nyqJ9mkehylSpVIxVFTSQ9/7/WpJNV8L5pCeQ/sU49g+mWt68tIBxNRjKTovHqeHypyOADU6nqf06VpZlRxXLmyj3qVFhrammEfI97aNx7Hka9SYonRRp1poTTO45ly258qp8XjVijaSRgqKLk9OXKrIr2uaqd4cAZsO8YGpF1HUqQwF+V7WpSZpjiuST6Mz3j3jkxLMFYpCD5VAsWHItVHGo0AIFzpfT5n8PlRThNzJ5lEl1iQ/Arg5jyLMOXOijY+4sEVmkvK+hzNoAR9lRw/E1KR6/8AZw4o1EqNx5nW8aKzoRfMdAG9eV+lG6YUtq5v25D2p/C4VIwFRQAOQ/vWpFh3FNRR5mXLzk2keI46cy17C1y1Uc42wpgMWN+XLv3pnHYjkOH5npXhZmVspF/5acvehATRXbV4Br0DToBWHUUqczGlRQiTTb8acvTT8azm2kVBbPNdB5GkK6BqKyg3ZrJKjqGxqQHpnJXDccNa6EzBodnfQU276V4LNwy1wR9adhR5ij1vTrJcV4xOJWJC7cB/YA70NzbxSE+RVUdxc+5pVZrjxSl0Sd4tmyOmeBgkyFWjYjQ5GD5G/hYgCouFmi2jAWy+HNGbSx8HikFxmXmFvex9QedTMBtvxCEkADHgRwJ6EHhULbeyZI5BjsJpOgtJH9WZOaOOtuB9OgtNUE4Si6fZ52dtF45PAn0fXI/BZAOJHRgOK8uIuOF2rlTflVFeLGwh0LeGzAdJMNMOCNbUAH4W5aDgRVpsuKaOMCYqWF9V0uATYkciRY25G9JxEpFiuIU87eulJp1H1h7a/lXmNUbiKfXDp0pcGVyRCdmk0UWHf9aeiw5UWFu5qVnAqHjNrQRf4kqR/fdU/Mimo0Q5NjMylHD+xHY1JfEdAST8vnTMOLhmH7uRJB1R1b8iaWNkMcbOkbSZRcIguzW5KDxNNKgsfVSeNPIgFA828W0XJEOz3XoZGC/hencKNryLeRsNDqdCGdgOWgOX8aYuw0zCmZ5FtQyNgYt/8XaL+kcaR/7tTS/+C4G/xZcVL9+VrfJbUDG9498EwgRfDMjNmsAyiwXLqx1t8Q5daFJPpJxBP7vDov3nZ/fRRRHtT6PIXVRhz4DA6tYuWUjVTdr9DUKH6M4RrJPK/YZUH5E/jTVCbYOvv/j73vCoB4BPwuWJrWNn4rxEVj9YA/MXoYh3EwKcY2f78jsPle1etp774XDB0Rg7It8icNCBlz/CD24ix0osP9DJ1AF72/rwFRpZDwrGd4dqY3ExxYuXNGgkvGF0RLANG6rxHPzNxtpobVqu721VxeGSYaMRZwPqyLo6/PUdiKGtCTHkjOdTbNyUfVva5LHkNP8AmnzGc19G+0ep7dhXFAU2Ol+B/nXrEYnwwKXofscNhw1HMc67Eb15EtwLcTT6JVJiZ6y12lSosBy9cYXr0a8k1LBHnLXVYCoLYpjwFq6EY/1rllmUXpG6xuXbJUmKA51Tbe260MLyRoGKAGx4WuAeHYk1OMSjiai4/DpJG8ZXRlZSfvC1Zf2ZXtpIv+FVozPGb7Y6T4XyDogA/E3P41o2w9qmWNJDxZRf151jkiS+I0SozOrFSqgk3U2OgrS9xdn4hISs0ZTzXUNxsR05e9ehr0cy/S43nclEHK7E+oAt+Zodo3xmAWSMo2nMHoRwNDE2x5lNvDLd11B/Ue9Umdvj5I8abK/uKPrXAvxsL+tD+ythNmDyjKBqF4knlfoKJWFKWzPyckZNJeiqwuy44pXmRQHky57aAlc1iRzPmNVu8u8UcK5QbueAHWr+dCQbcbGg/ZW7z5zNMLuSbA65e/rWdOzGNdsW7keILeJLIwDfU0t6nofSi1XsNaaw2FC1zHy+HG7/AGVZv9IJ/Sn0iW7YKbw7dkllfCYWRY2jUGWQ/Fr9SPoercvWh/D7IhSU4lUZsi6xS3Lu7DRgzH4uQvxN+HGlsbAhYxIi+K86Bpmfy5AxJZk8vmNydOdhrV1hsasmeOKVXJyi7izC66sCQARYaacaxnN+jphjVb7Bx9h4dZ1mM7YdWzFsnk8NzlITPaycTx4m1qLt3ttyrJ+z4m5Y5jFIbDxUXmQNA4FjbS4vppVaVzZ1dvERpB+6dVDNoBYHgVuLg24DjUPbi5IxL4T+LBKtmzAhULgkA81KEAi35Xpwm7pkzxqm0aYrgi9hTc+LijF5HRASACzBbk6AC/E0LbexeIjwcskDAOgzXsGOQHzkA3FwtzwPCst287SrHiCzN4iakktlkj8rqCeAOjAd62Wznej6BEg5EV6v3oV3K2v+0YZHJ8wGR/vLz9xY0RzOwUlRc20HC56X5VQh12oR3g33w2HJRT4svARx+Y36M3BfTU9qGMLjsZtWSWJ5hhYo9HiS+c3JFi5tfVSCdB/CavIt2IYEBw0YEqEOrtqzFfqsxBsrC6mw0DGwqZSS0y4Y3LZUS4XaOP1xD/s0B/8AKT42HRuf+r/TQtvlu2uEKNGCY2FvMbkONTr3Go9G7VrmGlWSNZEvlcAi4sRfkRyI4Ecjeq3b+yhiIXibTMPK32XGqt8/wvUc3Z0PBFwpdgLuZilnw8mClP1SyE8gTfTur2YevarL6OtqthcW+Dl0WQ2HQSqLKf8AMunqEoM2bJJDJoLSQuTlPa6uh7HzL70Ub1xRuiY2PN5whDroVbQo57i1vUCtzjNekANMFBYrxHQ61F3e2mcRh0ka2cDK4HDOALkdmBDDswqaza1LQ7OpYcBTuY01eu5qAPWvWlXM1coAmmvDU5TWIfKrNlLEAnKOJsL2Hc8KkCvmmKuVta+oNuNzrTiuT1NCrb14uQ/u9nObcC4k/WMfnXn/AMT2u58mEjjHUgfmZf0rln43KVt6No5eK6C8QMe1elwo560I/s22pP8AzYox2Kf/AM2/OundjaUn+JtAj7hf/tKVcPGgvX/SZZZP2F6YRFJIVQTqSABc9T1rr4iNPidF9WA/M0HD6P2b/Fxsz9eP/ezU5B9G+DTi0rH1Rf8ApQVulRFhBJvHg0+LEw+gkUn5A1HG+GBzBRMCWIAsrkXJsNcth61Gg3LwK/8AlFvvSSH8M1qssNu/hIyGTDxAjgfDUkdwSL1Qh2XbMS6eY+gvXgbYDfBFI3+Uj8asQFHAAelMz41E+JgPzPoKh6GhRzMSAUIFr3J4HpbrTr2qC+0CRdY2I6nyj5tagD6RNtTosZixGRSXSRYiCc1lZQXAuDa+lxSU03Q3HVmjS4pEF3dVHViAPmahy4mKaMlJFdHDLmUhgeKtYjQ2NxXz1PIznNIXc9ZHLfmTWj/Rjig8MkRt5HBsNQA4/mpq2iU9kbZDzvHNFMrA4f8Adq6nIFHNmGbzAAA34WqxkkZmmvIuQxoqMiXzP57gcczA2sB1q82vu87sJsO2VxbOhOWOVRwV7cCOTW7HTgNbQxeIiWQmCeKQOGiRUzxkgAEs6ixBN7i/S2tYSg70dUJqtsb2jj2iZZLu+HOVJiVs6kfCF4EHMRf9K9bSwYLphlEueeVZDd2ZfDTKXLa6WUcPSn8LJJKUeHCyu7/4viBo41JW2a7eW4sB5bm16vNkbKiwQafGTAyNcZmPlRb5hFGDrYacrmw6ABwh7Yp5F0tl8uFGQgi4N7jseIrHMVsxopMVgrXynxsP3yDzKPvRm3+WtoweNjmjEkTZ1PA6j8Dwod3i2WmdMQUVmQ21F9OQPbiPetHKtkYsTySUbqwL+jSWSOd0sfCdQQx4BxqvzBI9hWtxm4oKxkIRrroBZl9G1HyOlFmzsQHVWHMfjzHzojKzo8nxFiipRdpmfb1xHZ+0Isan+HLdJQOegz+9gHA6r3o5cAgEEEEXBHMHgRS3o2OuLwzxG2b4kJGgddVJ7cj2JoT+jvapkhbDSArJASoVuPh3KgHuhBT/AE9amcbVnPjlToucH+6maP6kuZ4+gfjKn+b4x1JfpVhIlRtq4RpI/IQHUh42PKRdVv2OqnsSKZbbcKwLPI6xqRqGPmDjRksNSwYEEC/Co7R0xdaAT6QNl+HKuLQaPZXt9oDQ+6j5qOtV+xttQrDLh5sxRwWRVGZgWuWQAcCGGYa8zRFj8fiNpq0ODgtCxGaeUWGhuCi8tQOp7CrzYX0f4eFQZlWd7386jIt+IC8x96/tW8LUaZxZacriVf0a4iUFkylo7WzgeQgXKENwuNRYa2YdKud5t84cGyKyl2LWYKbZRbU9zw071L3o2wMNCcoCtayAAeUDiQO3IdayzE7NGLjEscn7w30Y3U3N8hNrq1zz4n8K7I6Nb2Nt2DFLmikDdV4MPVf14VcIoNfOOAjxEc6xx50mzAKNRqedxy78LXrctnbTZQqyG5AAL2tc8yQNB7VLaQ4xb6CC1KmxOKVMCSGNdzVy1cIqQEWqLjsZ4a3tckgAdddfw/G1Pn1qixcUrO2pK6MA2o1BHl+ySDb50AT8LtJZVUgWJAJW+oNtQakYzGiKN5CdFUn8NPxqFsvDEqpYABb5QosNTct37dqgb6i8HhKbF7Zj0S4BPyLH2qgBbZP0pOrZMZCbEjLIgysQ3wsYzow53U+gNGOA3swkzFI5kLAkZScraGxsrWJHcUEb0JE8ixsLRwR5tNLMbZbNyyqhNv4hTW6G7EEuGaSaPN4jsUuSCqqbCxB43v8AKpcklbHGDbpGqpIDToYVmePwWIwQVsJinIZsoil/eJaxJsx1UC3KpWF38kit+2YcgcPEiOZfUqdR8zQpJ9DlCS7CHeSHFNYxOclvMkdg5PUMeXYa+vKk2Rs7Eq7HJIgZbFs6+ISCCBdgbc9bXoj2VvPhMTbw5kLH6hOV/wDQ1jVyqjlUyjbN4eS1j4cV/vsGF3fZ7GQJfmXZ8QfbOQq/I142vucMSnhviHChlYBUjFioINrIOIJFFBWkGoUEnZi5aBLAfRzgYrFo2kPWRi3+3QfhRLg9nRRC0caIOiqF/KpRekbGtCDtwKbMw5U3INa8VjObTpG2PGmrY/nvw41i+8bzviX8e4YEhV5Kt/KF7Ec+dbCard5NiJiIywUeKqnIb2ueIRj0J+VNSckDiosDtxtrLh3McjhUkIALGwEh0A9+HsK0DGQB1KngR/Zr5x2nJK8jLKCGTMCtrBMvxC35mte+jPeB8VA0cty8Vlzn6ykeW5+0LWPsedVx1slZPlaJRi8pVhrGSD91jrbrZtferTYkJVLXvqSLchwsfxNWD4RCbnW/EX07+vpT8KgCwsPSlGNHVm8t5Ica/R1V051me+cDYHGxbQjBKMckyjmDofmB81FaazCo+MwMcyFJY1dDa6sLg2Nxceoqjiszx95MXjmMezYCqcDiJQABx+Eagf7j/CKtdifR1EjeLi3OJlJLHN8GYm5OT63vp2FGRyRR6KFVRoAAAOgA5VQ4jHyOfiIHIKbf80aXRpCEsmwgSJQAAAANAALWHYV4ljPKqLD7QkQ6ksOYJv8AI0QpIGAI4EXoTsWTHKD2ZV9JeAm8RZrlowApX7B6nqDfj1050DYbEvG2ePn8Sngw/nX0FjsIsilWUEEEEHgQeIIoFwm5UUOJMjEsgIMaEXAb+I/WA5fje2py49kceXRZ7n7IEiLiJks5X92GHnRGGuY9T+XHjVnj9m21FSUfmONTYsQG0bjUtqXZok49AxmcaAnTvSolbBqeVKlxl9l84/RIglJ0biKeIqMcK2a+a3bl69q68dhcsfwrU5zmKlVEZm4AGqvByPIbG4UHVuBYgAEZeQ78fzNu4iksrKwHlNwPrAHjfiNelQ8PhWjNr5hc62I0vp+FqALFEoX2jL4krEnyrz/hXn+H40QYufJGzcDbT1OgrP8AGz//ACtwbtiXsDf6j8bdLRITbrepAGNsTNIgyi74mS4HA5SQEWx/hEae9aHgcsESROjRhFVbsLroLE51uup6kUKbt4Xx9o5iPJh1v2zfV/Fgf8laU7hQWbQAEk9hqamavRpjdbAva+JEkoCkFUW1wbjM9idfQL+NC29uIsiRA6u2voP7NaNBu/EyZmjyO5LsU8pzOS1jbQ2vbXpWV7aVXxsoLF44QwzGw4eS+mlwSW7hTRCOzTJP40VuD2eJp44UFg5RT2AuXbscutfRGCjyoB2rKPou2Z4mIeZltkU+gaRr2HoAR6EVqs8+RSegJ+VW2c6Q+wqg3t2t+y4WSQGzWyx/ffyr8r39qrsPvgHYqRl7HjV5FiY50Kuqsp0KsAQexBqVJMpwaMe2NvpisMQGkMqfZkYlh91z+t6Ptl/SLhJLCQtEx5ONP9YuKe2vuDhJQTGhibkYzYe6HT8qzrePdnFQWzRZ0UG0kag3H/qINRbr+NXonZs8eKjkAZGDKeBBuPnTgrH9yIHVGkSQrmNlCk5Tbi2U6cTb2o6wm35E0lTMPtLx9xWE4pyOyEJcE0gny30qTUDBbSjkHkYenP3FTg1aQioo5sjbewX23ulDNKZvgdgocgA5svwns1iRfpbpSRI8KgihRUUdABqeJPeiKVaCt4UnEjBIyQdQw4H+VqJMIK2PS7TtclvfWpmwtteMWUX8ut+ovaq3AboM4DSubnio4dqI8Ns5IhZFA5Uky5UkP7QlZYmdBcqCbdbdO9Vm6e2ziDJcWClcvcNf+Rq/iGlV8SCOS46gEeigX9LBFHe9X7MvRJ2spMZtysfa9DtFri49aqJ9ka3QgDof51LR04MsYqmVdqIMACI1B42/OouH2WAbuQew4e9WdhRFCz5Yy0jMcdvLjYdohJmKReJYIAuUxk5Q+a1zxBOuhFq0aSNXWqne3YQxUJAt4ieaNv4hyPY8DVduJtnxY/BkuHS4sTrZTlIPdTZT2Kk6mrq0c9lvJAydxXFe9XRQGok+AB1XQ1m4fRpGf2RvHalXP2R/s0qn5FVEtncDjUASGRrAWXjTyp4nmbhyH6muRjK5A52I7A30v6g1sYD6RjlXQK9E2/nQJvbvE8sn7Dg8xkbSR01yjmoPI9Ty4dbTQBFiGixsckMc1ipZHKWJVipGl9Da51Gl79KAsR9F80XmgxAfKGKrYoxY6C5uV0o33Q3aXBR2JDSuB4j9bcFHYXP40REVQGV7rbRGz/ETHRSxvI4JlZMyEW0XMvE3LHS/GjQbRhnVUilR87DNlYEhF8z3XiLgZdftVevErAggEHiDqD6ihvH7j4ORs8aNA/J4G8Mg9Qo8t+9qlqyozol7d2gMPh5JTxVTb7x0UfMisJuwUsSfOQzd7Bra+jMPetK3h3S2hJEYlxYnjBuFkASTQEAZ7HPx5kUE4bd3EmeLDzxSKGZV8yeXIt2cBx5ToONzwFOKoJy5Gq/R7s7wsGhIs8n7xuvmAyg9wgUet6I5VB0pYaMIgHDShve/bEkRjWIkOWLNYX8iA+W38RsPakxId21uxHKpZVswGltNahbqYOdHZZB5VFgeZN6mbC3ikmhjeWMK8jOFVb/BHYGQg8FLELbuOOtiKJAovzqVHZbm6o7K4VbmhfE7avJkDi9rhNLkX+K1ed6turEh58gPtN09BzP9KzvBQyTzXzENfMz8MoHPt0Ao7ElRp6YCCcXy5X6r5TfqeR96h4nYMqfARIOh8rfyNQcPiyrCxtawB68te5oo2ZtIP5W0bvz9KSqRusk4dPQIPGVbUMj+4+VWuA2zKhAfzr1Hxf1opnw6uLMoI6EXqB/4DEGDAFbcgdPkafFrop+RCSqUdk6GQMK8yxinEUKKiRbSjkkeNT5ktf3HEdelU6OaMZO2l0e/2xEZEN8zmygDoLkk8FA6mqKbbTOYZly/s0jvGdCHSRbhc99ArZTb1XrUzbsZCrKvGNsx+6dG+Wh9jVTg8EHkxGEJtDjEMkDf/bnSzEDvezjsnrSSE+rCfDyU1j081x9YW/zL5kueg1Pyqt3ax5liVnFnUlJF6SIcrD5irPa7kRO6rnZVLBb2zFdct+V7W96fon2SsNKHRWGoIBB7HhVDvZvImDjzkZnOiJe1z36AczTO5W2PHhcHRkdhYfZPmQjtY29jQtvBH4+2IIpBdEAax4GytJb3KiqGlbpDuHwOPxyeJNO0CPYqiZgwHH4QRx/i1qTHsTGYYZosS8luKsxufRGJVvwNFtK1RyZ2/wBeNUVu7W8iYjNGbCRLZ17HTMBxGoIIOoPsTX7X2DKmMTE4awzn94CbAMoNmPUMLqR3BtfUVG0oPB2xBImgmUhwOdwyn8VRvUVpHh5lsatvVo42uMuLFhZcyg0/VbC2RteBNj69ferMVMJWhTjTOUq7alVknhYmUWUi3K/L+leYcNlJZjdj8vapN6j4ia39/gKhuhpNg1vptGdESPDxuWlJTOvI/ZB+qTr5joADztT26O66YSPM1jK+rt0vrlXsKvsPD9ZuPIdBUmhN1sb/AAZc21PLXrwqrxBkYmSOTMh1sTdLDuBdDbr5e5q5NQpsJZs8bZH6jgfvLz9eNUIrxtfIbSAqeh09weDe3yFcm3hRWtlOX7Q19yONvSqveFXeySRhEXzkq11dgRlCr9W1yToL2B5VUZjVRhez1PD8FZY8pB7hsUri4INSlFBmyZGudbAan9fa16JcFOWFQ1To4/IwPFJxsmSUB7YRZJJnkOjusaHhkhgUSTuO5YhR3NqL9r4vwo2cakCyjqx0UD3IoL2ng80iREgqgUOLnUKSWHDXxJy9z9lENS2YJBFsJPFYzsuUMFVE+xEg8iD3LN3uKk7Yx+UFFOvO3IfztTTtJHD+7tnOgJ+EE8z+Qvpe1AONgkimDpI2d7h1fixAue2Y9D6jndN+i4r2RttwTSTgML5jaO3w29eR5m/flV1hsKsSeGup4u32m6egpjDY/iCWtzv8S+vMj+Lj1vxE6CG7DUFdLa8b8AeVu/Opk3VGkUrskYHCZjc/8d/5VNxWHF1CXzHgBx9R/f5VJFo1/vU1YYDCZfO/xn8BUpFNkXZu12U+HNxGgfh7MOR71fK1xpVHJhf2hiwsqqLBrfEf5Co+GxskDmOTUD3t09rVpGX2YyhfRfYlbg0B4eQxTqxNvMUf1DZSfxVqOVxCut1NZRva0hmxUTsfK0ciAeW8bLkcWHG2ZT/lpuNs6PG8lYlKMlaao1RfMtj7ihaGJ43fDg+eNhNhmPMA3CX/ANUZ/hI614+jnaBkwojY+aNih9OK/gbe1XO8ODLIJY7+JFdktxI+unfMOXUDpTao5bICuqY7PH/hY2MSoOBDoBnFuR1BPdqJUN11rPt4trQBFkjkXxEMcsSqMxJY2kiYj4VA8/m1Zj2FGmxtoJNGkqHyuoYe/I9xwqiQI3ab9l2hJAdFfMo/y/vIx/8AjY1735geDEw46NSVQgP6cPYEEiu7+RmHFQ4lQeV/WNs1vVlYj0FHSrHNGMwDIy8DqCCKX6NOit2dj454xLGwZT8wejDke1SZJFRSzEKoFySbADuaF8buGEcyYPEyYcn6ouV9NGBt2N6DMfh5p5TAuJfElTZ38wiQ9LliGPoP6Tw/ToXk62thXhcck2NM7MFijFlZyFFhexJPC5Zm9LUTRb4YEssa4qIsSALNcEngM1sv40GYbdfDwR58ZIpUkayHKl9NFW+vprXd4MKrNFhMDhozIzXaVECoij4szAcNQemmlzpWlejnk23bNBx40zfMdqcwWIuLcT16jrSw2HyxohObKoUsedha9QvDMbWHDivpzWs5fF2VH5Ki4zelKmo5wQKVWQOTy2/v8B3rkEX1m48h0/rXmCO9mYfdH6nvXvF4tI0aSRgqLxJ+XvUJXtjbrSHyaH9495BhgqIhklf4EHyzNbW1+Q1P41U4b6ScDI5juyG9laQAI3L4gTl/zWqLsqRZcbiJDrlsqdh8Nx7D/cetNulYRjydCOJ2w3nDwp/6eVflqD/1U/sPfGRpf2bGRiOXkRoD00ubX5a2NXooN+kGNV/Z5Ro4kygjiVuGt7EfjWcMjk6ZrPGoq0F228G8nmXUW4Dj/Whz9le4ABJJt/z0o4wLXjUnjYVyfBo/HQ9Rof61vGbjo6/H8+WKPGrRRYTBFfKfU/p87X9hV7AmUUo8KF1uSeZNRdtbRWCF5W4IpNup4KvubD3qDiyZHN2wH313lkTFIkTWEFmbQEGRtVBB+yLH1ParHc5mnRZZEC9At7EKAimx4aDv1rORHJNIFJu8rkse7m7H2F62nYuEEUaqosAAB2AFhTa0QmTmGluVUG1tlJIpFrj5lf8A9l7cRy7W85z6C9hxPC9v0qtxAKHMhPdf5VLjYKdMB8dhHhPmJZPquPMVH8R+uvfiOfWnMLiypt11sODX5oeGvTgex1o0KLILqBfmp4Hv2Pf59aGNp7Dy5mhUkXu8J0seJMZ+q3PLwPKpf0zZO+i32RjkLq0hJA0F+R7jj+vDlV/NL4reFGfLxdxwt0B6n++dZnBireYG44XtqLfVkXiCPmKKthbdKXBFwbErfXpmB5jv87Gig7C3ESrEgVRrwRRzNMx7NTIxlszNq7Hl6HlavGy7yEzOQSbhQNQgH6/3zqPtLFGV/Bj4X85H5elCRP4QtmIxc+GTkudTzHLT5VQb+YQLNh5j8L5oJD/C4OUn0zOfYUfYXCiNQAKGPpDgzYKXy3y5W9LMLt8r1aVGcnbBDcfFGHF+E2nioyn/AN2EkEfIMfetTLXWsT2mHJMqOQxjTExtwIZbJMB3BUk1q+7u0PHw8Uv20Un71rMPmDVtEoyveHZ/7PipIwLIx8SP7rk3X2OYewok+jbaeUvhWPw/vI/usfOo9DY+5qw+kjZOeFZ0HnhNz3jawce2h9jWf4TGmGSOdNfDYEjqh0dfkTQug9mqb84XxcIzDjGRIPRfj/2FqW4OL8TCqpOsZKH0X4f9pWrSFlli0syOtweRVhofcGg7cGQw4qXDMTzAv1jNr+rKwPoKlfRTDbb2CkkwsyRNlkZHCNzBI5HkTwvyvWcbtYueCFYU2bMXUtdiGRSxPxMWT058q1o1ExTaU+hIAsTsnEYlo2x08OHjVwyRLkLFrHTO1wGsTwLego1wcMca5YwAOvM9yedZNvztDxcR4Sm6x6Hpm+t/L2qPs/bs+GA8NyRewRvMnpl5e1qa2g9m2KwrziIww7jhUXAMzIhcBWKgso1AJGo9jU9VqWhrQMYveHDROY5JGVx8QysbE68l70qv5dnoxJIGvYVyo4/rK5lgaod9NnPPgpo4758oZAOJZGDhR65be9X165erMwBw2Ew+IwkOFmVBIsKZojbOlhlzqRwOhOnfvQhhWlwGLEYLPYGwN7SRnha3AjLyvbLzFGm8WEmwmKGOij8ePLkkSwLxqeLxm1wvM9Lm+huo5tTaKY3G4E4OORmSS8jFSAqMyZgTwsFDXN7D3p96Y7rZdpvvhctznDD6mUXv0ve1R8LgJtoTpLJGUgj1RW4tz976XPDlR7Fg1vcqpI+sQL/OpqoKiMIx2ipZJS0yLHFlFhyp1VpwpXkpTFZ5as6+knaV2TDKdB+8k9BpGp9Tc+wo7xuIEaM7GyqCSegAuTWJY/FvPI8hHnle6jovwxr7C1C2wYRbg7KMkjTMNF8q+vFj+Q+daTM2UZeA61F3Y2asMCIOQFz1PEn3N6tZYwRrTYiolYhTl4C362v2piOQPcNYNbX9DfpUiUNG3UNwqt2hhZZFdorZrDKDoT1APW17X0vbvWlqjPi7JWHi/eErw51MxWGDAcm5H9D1Hahbd/bBzCKW4caXOmYjTKw5OOHf14mMbBxWL2bLQEbb2G2cyJ5XtqLXDjv9sf7h71QRMVJLXUJqVDar/Gh+sv58COVapNhcws2o/EdweRoc2rsUqc+UHo1hbXTX7LHhfganaNE0yu2Rj3YDwpLlgAwGmvpy/TlajPZWCEa9zxNUW52wlQPLlyl2IUdFXQkdLm/DpRWiWqor2ROXocNV20cMJEZG4MpU+hFqsRXh0vVkGIQxmNMkn/007Rv/AOzifI1+tpBf3ol+i/FMI5cMx80EhH+Vif8AuV/nRJitzIZJZZHd8sqBXjFgp1U3Jte91vcWtVts7YsMJZo41Vn+JwPM33nOposKPeJgDoVYXDAgg8wRYisS2ngDBK8LfVJseqHVT8iK3pl0rOfpJ2XomIUfD5H+6fhPsbj3FCewPf0b7SLRNAx80JsO8bXK/I3HpavO28HJFtKKaON2DslyqkjMPI+YgWF4ytr9D0oR3e2j+z4pJCbKfJJ9xufsbH2rbcM9xTegXQ4GNqjyC5qQ7U3EtzUAVu0d2MNOLyRLnP118r/6hx970KPuIY8TG6yB4ka5VhZtNQNNGubDlWkcKgyG7VdiRyBKkgVxFr1SGKlXb1ygD3lrzl70qVACsaZiwyISyoilviIUAn1IGtKlQBIFdvSpUAK9cZ6VKkAD/SPtHLCsC8Zmsx/gSxf5+Uel6FdydnibEl2+GMCw/iOi/IAn5UqVC6D2a9FCAABTmWu0qYHkrTTxjpSpUAD+3N30lOcACSwGbhmB4KxHA9GsbcwRpVjs7AsgALl7C2Y6E9zrxpUqRSLEHqKTG4ta4PEUqVMR2MWFgAAOA6dq9UqVAhWryVPWlSoA85T2roelSoA93qBtXALNG8bcHUg+/P1HGu0qAMrG4mN8TwyqZOcmZSMt/iC3ze1q1jCQ5FC9AB8halSpsD1K1SMOlcpVK7B9HrENYVEipUqYkSAaV6VKgYr0qVKgD//Z"	alt="" width="100" height="40">
			</a>
<a href="index.jsp">Home</a>

</div>
</nav>



<h1>Welcome To MakeUpItem SearchByName Page</h1> <br>
<form action="searchbyname" method="get">
Search by Name<input type="text" name="name"/>
<input type="submit" value="searchByName"/>


</form>

<br>

<table class="table table-bordered">
 
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Name</th>
      <th scope="col">Brand</th>
      <th scope="col">Price</th>
      <th scope="col">Floavour</th>
        <th scope="col">IsGood</th>
         <th scope="col">Edit</th>
    </tr>
  </thead>

<c:forEach items="${makeUpDto}" var="m">
<tr>
<td>${m.id}</td>
<td>${m.name}</td>
<td>${m.brand}</td>
<td>${m.price}</td>
<td>${m.floavour}</td>
<td>${m.isGood}</td>
<td><a href="update?id=${m.id}"></a></td>
</tr>
</c:forEach>
</table>
</body>
</html>
