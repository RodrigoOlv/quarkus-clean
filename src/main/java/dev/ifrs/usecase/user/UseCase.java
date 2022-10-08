package dev.ifrs.usecase.user;

import dev.ifrs.model.User;

public class UseCase implements UseCaseInterface {

    @Override
    public User save(String name, String pass) {
        
        User user = null;

        // rule
        if ( pass.length() >= 5 ) {
            
            user = new User();

            user.setName(name);
            user.setPass(pass);

        }

        else {

            throw new IllegalArgumentException();

        }

        return user;
    }

}
