//package com.javaspring.batchprocessingdemo.config;
//
//import com.javaspring.batchprocessingdemo.entity.Customer;
//import com.javaspring.batchprocessingdemo.repository.CustomerRepository;
//import org.springframework.batch.item.ItemWriter;
//import org.springframework.batch.item.data.RepositoryItemWriter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Component
//public class CustomerInventryJpaItemWriter implements ItemWriter<Customer> extends Reposi {
//    @Autowired
//    private CustomerRepository customerRepository;
//
//    @Override
//    public void writer(List<? extends CustomerRepository> items) throws Exception {
//        setRepository(customerRepository);
//        setMethodName("save");
//        customerRepository.save(items);
//        afterPropertiesSet();
//        super.write(items);
//    }
//}
