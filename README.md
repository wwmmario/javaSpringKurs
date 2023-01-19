<h1 align="center">Курсовая работа на тему "Гостиничный бизнес".</h1>
<hr>
<h3> Оглавление </h3>
<hr>
1.Структура проекта<br>
&nbsp;&nbsp;1.1 Описание проекта<br>
&nbsp;&nbsp;1.2 Описание сервиса<br>
&nbsp;&nbsp;1.3 Models<br>
&nbsp;&nbsp;1.4 Views<br>
&nbsp;&nbsp;1.5 Controllers<br>
2. Страницы сайта<br>
&nbsp;&nbsp;1.1 Блоки Header и Footer<br>
&nbsp;&nbsp;&nbsp;&nbsp;1.1.1 error.html <br>
&nbsp;&nbsp;&nbsp;&nbsp;1.1.2 footer.html header.html<br>
&nbsp;&nbsp;&nbsp;&nbsp;1.1.3 headerAdmin.html<br>
&nbsp;&nbsp;&nbsp;&nbsp;1.1.4 headerManager.html<br>
&nbsp;&nbsp;&nbsp;&nbsp;1.1.5 headerUnivers.html<br>
&nbsp;&nbsp;&nbsp;&nbsp;1.1.6 headerUser.html <br>
&nbsp;&nbsp;1.2 admin.html<br>
&nbsp;&nbsp;1.3 blog-add.html<br>
&nbsp;&nbsp;1.4 blog-details.html<br>
&nbsp;&nbsp;1.5 blog-edit.html<br>
&nbsp;&nbsp;1.6 blog-main.html<br>
&nbsp;&nbsp;1.7 book.html<br>
&nbsp;&nbsp;1.8 clients.html<br>
&nbsp;&nbsp;1.9 error-not-found.html <br>
&nbsp;&nbsp;1.10 home.html <br>
&nbsp;&nbsp;1.11 login.html<br>
&nbsp;&nbsp;1.12 manager.html<br>
&nbsp;&nbsp;1.13 price.html<br>
&nbsp;&nbsp;1.14 question.html<br>
&nbsp;&nbsp;1.15 question-edit.html<br>
&nbsp;&nbsp;1.16 registration.html<br>
&nbsp;&nbsp;1.17 reserve.html<br>
&nbsp;&nbsp;1.18 reserve-edit.html<br>
&nbsp;&nbsp;1.19 rooms.html<br>
&nbsp;&nbsp;1.20 special.html<br>
&nbsp;&nbsp;1.21 special-edit.html<br>
&nbsp;&nbsp;1.22 user.html<br>
&nbsp;&nbsp;1.22 user.html<br>
&nbsp;&nbsp;1.23 user-controller.html<br>
&nbsp;&nbsp;1.24 user-edit.html<br>
3. Как собрать проект<br>
<hr>
<h2> 1.Структура проекта</h2><br>
<hr>
<h3>Описание проекта</h3><br>
Проект написан на ЯП Java с использованием фреймворка Spring, БД MySQL, а также
HTML- и CSS-шаблоны Bootstrap (https://getbootstrap.com/) и
механизм шаблонов Java XML/XHTML/HTML5 - Thymeleaf. Структура проекта соответствует схеме MVC. 
<h3>Описание сервиса</h3><br>
<div>Сервис представляет собой сайт - гостиничный бизнес. Пользователь может ознакомиться со списком услуг, номерами отеля, блогом гостиницы. Eсли пользователь захочет забронировать номер в отеле, то ему придется зарегистрироваться. На сайте присутствует регистрация и авторизация пользователей. У зарегистрированных пользователей может быть одна из трёх ролей: user, manager, admin. Обычный зарегистрированный пользователь, в отличие от незагеристрированного может заполнить форму записи и сделать запрос на бронирование. Менеджеру доступны функции по управлению сервисом. А администратор по сравнению с менеджером может регистрировать новых пользователей назначая им роли.</div>
<h3>Models</h3><br>
<div></div>
<div>Сервис работает с базой данных, в которой хранится информация об блоге гостинницы,  вопросах от пользователей,  персональных данных пользователей и об бронирование. Поэтому под категорию моделей попадают все классы данных, хранящихся в БД, репотизориев и сервисов.</div>
<h3>Views</h3><br>
<div>Работу сервиса отображают страницы сайта. Поэтому под категорию представлений попадают HTML шаблоны страниц, которые могут отображать различную информацию, в зависимости от различных условий (роль пользователя, наполнение базы данных и т.д.).</div>
<h3>Controllers</h3><br>
<div>Для того, чтобы загружать страницы сайта с нужной информацией, а также для обработки POST запросов нужны классы, которые будут всё это делать. Под эту категорию как раз попадают контроллеры. Они достают из БД нужные данные, а затем отправляют их на страницы, которые их уже отображают нужным образом. Также контроллеры формы на страницах, добавляя в БД новые данные.</div>

<h2>Models</h2><br>
<hr>
<p>Блоки Header и Footer</p> <br>

footer.html<br>
![image](https://user-images.githubusercontent.com/117315569/213351965-3e29225e-4143-4641-8624-058abd0dd6f9.png)

header.html<br>
![image](https://user-images.githubusercontent.com/117315569/213351993-38a7958b-4bd8-4190-9310-3403ce10c9fb.png)

admin.html<br>
![image](https://user-images.githubusercontent.com/117315569/213352069-9746ce6c-7e14-4d43-98f8-5c108f0a4edf.png)

blog-add.html<br>
![image](https://user-images.githubusercontent.com/117315569/213352121-1bb1ca92-cd49-432e-821b-245b02ee9a58.png)

blog-details.html<br>
![image](https://user-images.githubusercontent.com/117315569/213352163-b0be3f86-bb65-460a-9845-e4bac6c5ce4a.png)

blog-edit.html<br>
![image](https://user-images.githubusercontent.com/117315569/213352212-54c858ca-165f-4d43-8db1-d76999a85604.png)

blog-main.html<br>
![image](https://user-images.githubusercontent.com/117315569/213352269-ddc96106-3422-4dde-9136-ec0475d7a442.png)

book.html<br>
![image](https://user-images.githubusercontent.com/117315569/213352324-566d58b1-da8d-4b0d-9037-c49a594b9b8d.png)

error-not-found.html <br>
![image](https://user-images.githubusercontent.com/117315569/213352377-5733bb17-47a7-450d-adbe-a78e98a9ef0b.png)

 home.html <br>
![image](https://user-images.githubusercontent.com/117315569/213352425-dd5b4055-d646-4adc-b8e6-be02e358ca6b.png)
![image](https://user-images.githubusercontent.com/117315569/213352457-545a6654-f99e-4249-be68-2ffe138e8eb5.png)
![image](https://user-images.githubusercontent.com/117315569/213352502-92eabead-8496-44ed-ade3-4b1519931a0c.png)

 login.html<br>
![image](https://user-images.githubusercontent.com/117315569/213352530-4a68265c-769c-473e-9d0f-de31bc2b036a.png)

 manager.html<br>
![image](https://user-images.githubusercontent.com/117315569/213352568-7c79a058-eca4-4f1c-9d1a-8e8eb707a8c9.png)

 price.html<br>
![image](https://user-images.githubusercontent.com/117315569/213352597-61f58897-0fae-4b88-85bd-f7ab7df8363d.png)

 question.html<br>
![image](https://user-images.githubusercontent.com/117315569/213352623-b1fc02aa-6d47-4f0c-a8ef-4012f05872fd.png)

 question-edit.html<br>
![image](https://user-images.githubusercontent.com/117315569/213352660-55570ebf-8a73-4295-aedd-801ac52c6774.png)

 registration.html<br>
![image](https://user-images.githubusercontent.com/117315569/213352712-c975f389-c198-49af-9f9f-868b75e3e3a4.png)

 reserve.html<br>
![image](https://user-images.githubusercontent.com/117315569/213352751-b0fe0167-0267-4eb4-a368-bbf8ca1103cb.png)

 reserve-edit.html<br>
![image](https://user-images.githubusercontent.com/117315569/213352784-2201313f-9fe4-4bb7-a603-598b4faa6c4b.png)

 rooms.html<br>
![image](https://user-images.githubusercontent.com/117315569/213352838-f1b1dcb0-e851-4f0d-ae8d-2926028cde75.png)

 special.html<br>
![image](https://user-images.githubusercontent.com/117315569/213352926-28cc046a-77ac-4479-b4ed-52342f6c6276.png)

 special-edit.html<br>
![image](https://user-images.githubusercontent.com/117315569/213352965-672790df-21de-4145-819b-616e57810b04.png)

 user-controller.html<br>
![image](https://user-images.githubusercontent.com/117315569/213353017-238c1e17-e4bc-4929-802c-39de7936ed0e.png)

 user-edit.html<br>
![image](https://user-images.githubusercontent.com/117315569/213353132-b235b344-1190-4a37-b25a-b84812c6e11a.png)

 user.html<br>
![image](https://user-images.githubusercontent.com/117315569/213353193-d73c2615-fe68-4933-af8d-d31b41f0a83f.png)


<h2>Как собрать проект</h2><br>
<hr>
<div>Чтобы запустить данный проект на своём пк, нужно:

1. В среде разработки Intellij Idea создать Spring Boot проект. <br>
2. Подключить к проекту данный репозиторий.<br>
3. Сделать update проекта с репозитория.<br>
4. В СУБД MySQL создать базу данных.<br>
5. В файле application.properties ввести нужные название базы данных, имя пользователя (стандартно "root") и пароль.<br>
</div>
<code>spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/[НАЗВАНИЕ БАЗЫ ДАННЫХ]
spring.datasource.username=[ИМЯ ПОЛЬЗОВАТЕЛЯ]
spring.datasource.password=[ПАРОЛЬ]
</code>
