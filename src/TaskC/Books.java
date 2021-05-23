package TaskC;

import java.util.Random;

public class Books { // Класс книги
    private int id; // айди номер книги
    private String autor; // Автор книги
    private int yearIssue; // Год выпуска киниги
    private String name; // Название книги
    private String name1; // Данный параметр нужен был дял меня для того чтобы сортировать книги по отделам
    private String name2;  // Данный параметр нужен был дял меня для того чтобы сортировать книги по отделам
    private static int countBooks; // Счетчик книг и для инкремитации IDномера


    public Books() { // конструктор для создания книги из пустого
        randomBooks(); // метод позволяющий создовать книгу со всеми свойстваи сллучайным образом
        countBooks++; // счатчик количества оброщений к классу
        this.id = countBooks; // Передача номера созданной книге
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    public static int getCountBooks() {
        return countBooks;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {

        this.autor = autor;
    }

    public int getYearIssue() {
        return yearIssue;
    }

    public void setYearIssue(int yearIssue) {

        this.yearIssue = yearIssue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format("Книга: %s\n" +
                "Автор: %s\n" +
                "Год выпуска: %s\n" +
                "Индефикатор книги: %s\n",name,autor,yearIssue,id);
    }

   public void randomBooks(){ // генератор случайных параметров для книги
        // Был создан потому что было лен ьпостоянно при проверке пичатать все это в книги
        Random ran = new Random();
        String[][] autors = new String[2][5];
        autors[0][0] = "Зигмунд ";      autors[1][0] = "Фрейд";
        autors[0][1] = "Александр ";  autors[1][1] = "Пушкин";
        autors[0][2] = "Михаил ";     autors[1][2] = "Булгаков";
        autors[0][3] = "Лев ";        autors[1][3] = "Толстой";
        autors[0][4] = "Сергей ";     autors[1][4] = "Мительский";

        this.autor = autors[0][ran.nextInt(5)]+ autors[1][ran.nextInt(5)];
        String[][] names = new String[2][5];

        names[0][0] = "Психалогия ";  names[1][0] = "Програмиста ";
        names[0][1] = "Техника ";     names[1][1] = "Анимешника ";
        names[0][2] = "Основы ";      names[1][2] = "Похоти ";
        names[0][3] = "Кодекс ";      names[1][3] = "Девственика ";
        names[0][4] = "Роман ";       names[1][4] = "Шизофреника";
        this.name1 = "" + names[0][ran.nextInt(5)];
        this.name2 = "" + names[1][ran.nextInt(5)];
        this.name = this.name1 + this.name2;
        this.yearIssue = ran.nextInt(2021 - 1567 + 1) + 1567;


    }
}
