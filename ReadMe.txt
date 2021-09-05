
1.Создать JAX-RS приложение, которое принимает

- имя,
- год рождения,
- пол
И отвечает в формате JSON цельным сообщением «Уважаемая(ый) {Имя}, ваш год рожения {XXXX}, вам {N} лет».
Ответ зависит от пола и года рождения клиента.

- Метод POST.
- Если год рождения позже 2000 года – вернуть ошибку.
- Все запросы хранить в Map. или в базе(что сложнее):
 В БД Таблица запросов должна иметь:
   id, request_date_time, name, birth_year, gender
- Сделать отдельный метод, который показывает все запросы (история).
- Запросы можно удалять из истории.
- Создать отдельные точки, которые по Get возвращают всех людей определенного имени,
 года рождения или пола (поиск).Иммерсивное средство чтения






 SQL_______________________________SQL____________________SQL___________________________________________


CREATE TABLE public.users (
	id_user serial NOT NULL,
	login varchar NOT NULL,
	dateberth int4 NOT NULL,
	gender bool NULL,
	CONSTRAINT users_login_key UNIQUE (login),
	CONSTRAINT users_pkey PRIMARY KEY (id_user)
);


 CREATE TABLE public.user_request (
 	id_request serial NOT NULL,
 	request_data_time timestamp NULL,
 	id_user int4 NULL,
 	CONSTRAINT user_request_pkey PRIMARY KEY (id_request),
 	CONSTRAINT user_request_id_user_fkey FOREIGN KEY (id_user) REFERENCES public.users(id_user)
 );

