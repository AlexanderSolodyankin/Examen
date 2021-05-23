package TaskC;

import java.util.Arrays;



public class Departament {
    private String name;
    private Books[] booksDepartament;

    public Departament(String name){
        this.booksDepartament = new Books[0]; // задал нулевой массив для исключение ошибки "Null" формата
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void setBooks(Books books){ // реалезована возможность добовлять элемент в массив
        this.booksDepartament = Arrays.copyOf(this.booksDepartament,this.booksDepartament.length + 1);
        this.booksDepartament[this.booksDepartament.length - 1] = books;
    }

    Books[] getBooksDepartament(){return booksDepartament;}

    private int countBooks(){
        return this.booksDepartament.length;
    }

    @Override
    public String toString(){ // вывод информации иотдела в моем случае это только имя
        // и количество книг в нем хронящихся
        String outInform = "";
        outInform = String.format("Отдел %s.\n" +
                "Количество хронящихся книг: %s\n", this.name, countBooks());
        return outInform;
    }

    public String outAllInformationsTheDeportament(){ // вывод полной нформации а также всех хронящихся книг в отделе
        String allInformation = String.format("Отдел %s.\n" +
                "Количество хронящихся книг: %s\n", name, (booksDepartament.length));
        for (Books allBooks: booksDepartament) {
            allInformation = allInformation + "\n" + allBooks;
        }
        return allInformation;
    }

    public void searchBookByAutor(String autor){ // метод позволяющий найти книгу по автору в отделе
        String outSearch = "";
        for (int i = 0; i < this.booksDepartament.length; i++){
            if(autor.equals(booksDepartament[i].getAutor())){
                outSearch = "Книга которую вы запрашивали: \n" + booksDepartament[i];
            }else {
                outSearch = "Такой книги в данном отделе нет";
            }
        }
        System.out.println(outSearch);
    }
}
