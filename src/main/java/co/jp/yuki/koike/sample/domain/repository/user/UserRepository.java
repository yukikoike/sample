package co.jp.yuki.koike.sample.domain.repository.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.jp.yuki.koike.sample.domain.model.User;

/**
 * ユーザーRepositoryクラス
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

	User findOne(String username);
}
