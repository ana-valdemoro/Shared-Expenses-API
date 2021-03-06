package com.shared.expenses.api.sharedexpensesapi.Repositories;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

@NoRepositoryBean
public interface BaseRepository<T, ID> extends Repository<T, ID>{

  <S extends T> S save(S entity);

  long count(); 
  
  T findById( Long id);
}
