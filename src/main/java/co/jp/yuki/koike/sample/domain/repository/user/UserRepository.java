package co.jp.yuki.koike.sample.domain.repository.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.jp.yuki.koike.sample.domain.model.User;

/**
 * ユーザーRepositoryクラス
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

    /**
     * ユーザー情報を取得する
     *
     * @param username ユーザーID
     * @return ユーザーエンティティ
     */
    User findOne(String username);
}
