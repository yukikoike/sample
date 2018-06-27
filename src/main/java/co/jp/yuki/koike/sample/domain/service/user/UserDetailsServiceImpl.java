package co.jp.yuki.koike.sample.domain.service.user;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import co.jp.yuki.koike.sample.domain.model.User;
import co.jp.yuki.koike.sample.domain.repository.user.UserRepository;

/**
 * UserDetails実装クラス
 */
public class UserDetailsServiceImpl implements UserDetailsService {

    /**
     * Logger
     */
    private final static Logger logger =
            LoggerFactory.getLogger("co.jp.yuki.koike.sample.app.controller.UserDetailsServiceImpl");

    /**
     * UserRepository
     */
    @Autowired
    UserRepository userRepository;

    /*
     * (非 Javadoc)
     * @see org.springframework.security.core.userdetails.UserDetailsService#loadUserByUsername(java.lang.String)
     */
    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        logger.info("enter loadUserByUsername.");
        User user = Optional.ofNullable(userRepository.findOne(username))
                .orElseThrow(() -> new UsernameNotFoundException(username + " is not found."));
        logger.debug("userId = " + user.getUserId() + "%n" + "password = " + user.getPassword() + ".");
        logger.info("exit loadUserByUsername.");
        return new UserDetailsImpl(user);
    }
}
