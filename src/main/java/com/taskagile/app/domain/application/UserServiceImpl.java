package com.taskagile.app.domain.application;

import javax.transaction.Transactional;

import com.taskagile.app.domain.application.commands.RegistrationCommand;
import com.taskagile.app.domain.model.user.RegistrationException;

import org.springframework.stereotype.Service;

/**
 * UserServiceImpl
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

  @Override
  public void register(RegistrationCommand command) throws RegistrationException {
    
  }

}