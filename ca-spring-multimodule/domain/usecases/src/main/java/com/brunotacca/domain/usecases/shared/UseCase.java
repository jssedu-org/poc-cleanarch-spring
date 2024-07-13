package com.brunotacca.domain.usecases.shared;

import com.brunotacca.domain.usecases.shared.exceptions.DomainException;

public interface UseCase<I,O> {
  
  public O execute(I inputDTO) throws DomainException;
  
}