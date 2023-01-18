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
<div>Блоки Header и Footer</div>
footer.html <br>
![image](https://user-images.githubusercontent.com/117315569/212823823-3cf240a3-0c79-49ad-a14d-434efeee5792.png)

header.<br>
![image](https://user-images.githubusercontent.com/117315569/212823696-c5f45944-4dfb-48a2-96ef-498a2d2bd100.png)

headerAdmin.html<br>
![image](https://user-images.githubusercontent.com/117315569/212823870-d9c667d2-d389-4aac-ab20-c651c83c9450.png)

headerManager.html<br>
![image](https://user-images.githubusercontent.com/117315569/212823997-4d78d8f0-b2ce-482e-ac01-cd188f9088bf.png)

headerUnivers.html<br>
![image](https://user-images.githubusercontent.com/117315569/212824029-5abb9c6b-33bc-43a5-a88c-0270731a7e1d.png)

headerUser.html<br>
![image](https://user-images.githubusercontent.com/117315569/212824077-bd72f49e-32c2-436b-b921-8a7de72b7a48.png)

admin.html<br>
![image](https://user-images.githubusercontent.com/117315569/213049035-4d8efe23-09d8-47c4-bf1d-6c07d64b7a5b.png)

blog-add.html<br>
![image](https://user-images.githubusercontent.com/117315569/212824670-7df60c74-a128-48d0-8167-bdbccc3b8feb.png)

blog-details.html<br>
![image](https://user-images.githubusercontent.com/117315569/212824610-bf495418-2f05-48aa-b44c-1a1d23e73e91.png)

blog-edit.html<br>
![image](https://user-images.githubusercontent.com/117315569/212824697-8adaa8ed-65f1-413d-a6ca-1de020ab6b42.png)

blog-main.html<br>
![image](https://user-images.githubusercontent.com/117315569/212824586-32085d97-052d-4c90-ba20-d34c7608e555.png)

book.html<br>
![image](https://user-images.githubusercontent.com/117315569/213050111-854f29d8-21e8-48a6-a79b-53bf0930ec02.png)

error-not-found.html <br>
![image](https://user-images.githubusercontent.com/117315569/212825500-d60fb3ed-bfc0-4eda-9650-420db387469a.png)

 home.html <br>
 ![image](https://user-images.githubusercontent.com/117315569/212824381-f121d91b-5509-46e5-85ee-e27ae8e460fe.png)
![image](https://user-images.githubusercontent.com/117315569/212824438-b03faa3c-4073-491d-99b8-95e65de03ed7.png)
![image](https://user-images.githubusercontent.com/117315569/212824483-2dee0d41-b942-49cc-8738-892d094c0f63.png)

 login.html<br>
 ![image](https://user-images.githubusercontent.com/117315569/213050536-762e8b61-fe6a-4ad6-9b70-7add3e153a76.png)

 manager.html<br>
 ![image](https://user-images.githubusercontent.com/117315569/213051528-00aebfb5-c76d-4106-8c58-4f69db8ea977.png)

 price.html<br>
 ![image](https://user-images.githubusercontent.com/117315569/212824543-cb15aee6-e341-4736-9702-a598d85389d1.png)

 question.html<br>
 ![image](https://user-images.githubusercontent.com/117315569/212825241-4c041b88-be56-46f1-bc53-cab79e12b9d3.png)

 question-edit.html<br>
![image](https://user-images.githubusercontent.com/117315569/212825271-375df842-4fa1-4423-91d6-35e79c0efb37.png)


 registration.html<br>
 ![image](https://user-images.githubusercontent.com/117315569/213051959-bbf7ce00-8075-4476-9ed2-c27a62fc5de4.png)

 reserve.html<br>
 ![image](https://user-images.githubusercontent.com/117315569/212824812-69d220ed-e603-4f9f-9602-d113d8412e81.png)

 reserve-edit.html<br>
 ![image](https://user-images.githubusercontent.com/117315569/212825134-669deaa5-79e5-43b7-8275-cd426101cae2.png)

 rooms.html<br>
 ![image](https://user-images.githubusercontent.com/117315569/212824509-885e1746-a2a4-47e4-9ee6-b2a807f2f6ff.png)

 special.html<br>
 ![image](https://user-images.githubusercontent.com/117315569/212824889-ce7cb91f-871a-4bc5-9cac-6baf09b78233.png)

 special-edit.html<br>
 ![image](https://user-images.githubusercontent.com/117315569/212824913-6296a4de-9fd7-4c6f-9822-ee6c537302b7.png)

 user-controller.html<br>
 ![image](https://user-images.githubusercontent.com/117315569/212824773-c9b33bbd-7747-4940-aeff-beedb121c221.png)

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
