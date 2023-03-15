package com.bnuz.propertymanagement.config;


import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

        import javax.sql.DataSource;


/* Mybatis配置类*/


@Configuration
@MapperScan("com.bnuz.propertymanagement.mapper")
public class MybatisConfig {

    @Autowired
    private DataSource  dataSource;

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception{
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath*:mapper/*.xml"));
        return sessionFactory.getObject();
    }

}
