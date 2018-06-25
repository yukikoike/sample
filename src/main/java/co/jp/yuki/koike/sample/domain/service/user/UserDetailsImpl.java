package co.jp.yuki.koike.sample.domain.service.user;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import co.jp.yuki.koike.sample.domain.model.User;

/**
 * UserDetails実装クラス
 */
@Component
public class UserDetailsImpl implements UserDetails {

	/**
	 * User情報
	 */
	private final User user;

	/**
	 * コンストラクタ
	 */
	public UserDetailsImpl(User user) {
		this.user = user;
	}

	/**
	 * ユーザー情報を返す
	 */
	public User getUser() {
		return user;
	}

	/*
	 * (非 Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#getAuthorities()
	 */
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return AuthorityUtils.createAuthorityList("ROLE_" + this.user.getRoleName());
	}

	/*
	 * (非 Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#getPassword()
	 */
	@Override
	public String getPassword() {
		return this.user.getPassword();
	}

	/*
	 * (非 Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#getUsername()
	 */
	@Override
	public String getUsername() {
		return this.user.getUserId();
	}

	/*
	 * (非 Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#isAccountNonExpired()
	 */
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	/*
	 * (非 Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#isAccountNonLocked()
	 */
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	/*
	 * (非 Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#isCredentialsNonExpired()
	 */
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	/*
	 * (非 Javadoc)
	 * @see org.springframework.security.core.userdetails.UserDetails#isEnabled()
	 */
	@Override
	public boolean isEnabled() {
		return true;
	}
}
