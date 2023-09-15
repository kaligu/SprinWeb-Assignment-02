/*
  @ Author       : C.Kaligu Jayanath
  @ Prjoect Name : SprinWeb-Assignment-02
  @ Date         : 9/15/2023
  @ Time         : 10:54 PM
*/
package lk.pmc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;


/**
 * @author : H.C.Kaligu Jayanath
 * Date    : 9/15/2023
 * Time    : 10:54 PM
 */
@Configuration
public class JPAConfig {
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource, JpaVendorAdapter jpaVendorAdapter){
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setPackagesToScan("lk.pmc.entity");
        bean.setDataSource(dataSource);
        bean.setJpaVendorAdapter(jpaVendorAdapter);
        return bean;
    }

    @Bean
    public DataSource dataSource(){ //me data source ek testing wlt netnm pool ekk dnne
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql//localhost:3306/SpringWeb-Assignment-02?createDatabaseIfNotExist=true");
        dataSource.setUsername("root");
        dataSource.setPassword("1234");
        return  dataSource;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){
        HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
        hibernateJpaVendorAdapter.setDatabasePlatform("org.hibernate.dialect.MySQL8Dialect");
        hibernateJpaVendorAdapter.setDatabase(Database.MYSQL);
        hibernateJpaVendorAdapter.setGenerateDdl(true);
        hibernateJpaVendorAdapter.setShowSql(true);
        return hibernateJpaVendorAdapter;
    }

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
        return new JpaTransactionManager(emf);
    }
}
