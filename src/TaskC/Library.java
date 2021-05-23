package TaskC;

import java.util.Arrays;

public class Library {
    /** Библиотека принимает книги она же и распределяет книги по отделам
     * Следовательно все книги хоть и распределены по отделам все же хронятся они в библиотеке
     * таким оьбразом я расуждал при созжании данного класса
     */
    private Books[] bookLibrery;
    private Departament fiction;
    private Departament legalDepartamentl;
    private TexhnicDepartament texhnicDepartament; // Наследник класа департамент добовляющий функцию "Компьютер"


    public Library(Books[] books){
        this.bookLibrery = books;
        this.fiction = new Departament("Художественной литературы");
        this.legalDepartamentl = new Departament("Юредической литературы");
        this.texhnicDepartament = new TexhnicDepartament("Технической литературы");
        for(int i = 0; i < this.bookLibrery.length;i++){ // Цикл  в котором распределяются книги по отделам
            if(this.bookLibrery[i].getName1().equals("Роман ")){
                this.fiction.setBooks(this.bookLibrery[i]);
            }
            if(this.bookLibrery[i].getName1().equals("Кодекс ")|| this.bookLibrery[i].getName1().equals("Психалогия ")){
                this.legalDepartamentl.setBooks(this.bookLibrery[i]);
            }
            if(this.bookLibrery[i].getName1().equals("Техника ")||this.bookLibrery[i].getName2().equals("Програмиста ")){
                this.texhnicDepartament.setBooks(this.bookLibrery[i]);
            }

        }
    }

    public TexhnicDepartament getTexhnicDepartament() {
        return texhnicDepartament;
    }

    public void setTexhnicDepartament(TexhnicDepartament texhnicDepartament) {
        this.texhnicDepartament = texhnicDepartament;
    }

    public void setFiction(Departament fiction) {
        this.fiction = fiction;
    }

    public Departament getLegalDepartamentl() {
        return legalDepartamentl;
    }

    public void setLegalDepartamentl(Departament legalDepartamentl) {
        this.legalDepartamentl = legalDepartamentl;
    }

    public Departament getFiction(){
        return fiction;
    }

    public Books[] getBookLibrery() {
        return bookLibrery;
    }

    public void setBookLibrery(Books[] bookLibrery) {
        this.bookLibrery = bookLibrery;
    }
    public void setOneBook(Books book){ // метод позволяющий добавлять книку в общий массив книг если это нужно
        this.bookLibrery = Arrays.copyOf(this.bookLibrery,this.bookLibrery.length + 1);
        this.bookLibrery[this.bookLibrery.length - 1] = book;
    }

    @Override
    public String toString(){ // вывод информацции отделов

        return String.format("Библеотека.\n" +
                "Первый отдел в Библеотеке: %s\n" +
                "Второй отдел в Библеотеке: %s \n" +
                "Третий отдел в Библеотеке: %s \n",
                fiction.toString(), legalDepartamentl.toString(), texhnicDepartament.toString());
    }
}
