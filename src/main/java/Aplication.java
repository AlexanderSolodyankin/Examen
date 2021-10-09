import model.PaymentMethod;
import model.ProductCategory;
import org.hibernate.Session;
import util.HibernateUtil;

public class Aplication {
    public static void main(String[] args) {
//        PaymentMethod paymentMethod = new PaymentMethod();
//        saveEntity(paymentMethod);
        ProductCategory productCategory = new ProductCategory();
        saveEntity(productCategory);

    }

    public static <T> T saveEntity(T entity) {

        Session hibernateSession = HibernateUtil.getSessionFactory().openSession();
        hibernateSession.beginTransaction();
        hibernateSession.saveOrUpdate(entity);
        hibernateSession.getTransaction().commit();
        hibernateSession.close();
        return entity;
    }
}
