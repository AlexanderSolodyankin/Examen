package TaskC;

import java.util.Arrays;

public class Library {
    private Books[] bookLibrery;
    private Departament fiction;
    private Departament legalDepartamentl;
    private TexhnicDepartament texhnicDepartament;


    public Library(Books[] books){
        this.bookLibrery = books;
        this.fiction = new Departament("Художественной литературы");
        this.legalDepartamentl = new Departament("Юредической литературы");
        this.texhnicDepartament = new TexhnicDepartament("Технической литературы");
        for(int i = 0; i < this.bookLibrery.length;i++){
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
    public void setOneBook(Books book){
        this.bookLibrery = Arrays.copyOf(this.bookLibrery,this.bookLibrery.length + 1);
        this.bookLibrery[this.bookLibrery.length - 1] = book;
    }

    @Override
    public String toString(){
        return String.format("Библеотека.\n" +
                "Первый отдел в Библеотеке: %s\n" +
                "Второй отдел в Библеотеке: %s \n" +
                "Третий отдел в Библеотеке: %s \n",
                fiction.toString(), legalDepartamentl.toString(), texhnicDepartament.toString());
    }
}
