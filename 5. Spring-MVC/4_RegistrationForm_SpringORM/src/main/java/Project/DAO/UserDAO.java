package Project.DAO;

import Project.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDAO {

    @Autowired
    private HibernateTemplate hibernateTemplate;
    @Transactional
    public int saveUser(User user) {
        int id = (Integer) this.hibernateTemplate.save(user);
        return id;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }
}
