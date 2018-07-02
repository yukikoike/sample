package co.jp.yuki.koike.sample.domain.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ユーザーエンティティクラス
 */
@Entity
@Table(name = "USER_MST")
public class User implements Serializable {

    /**
     * ユーザーID
     */
    @Id
    private String userId;

    /**
     * パスワード
     */
    private String password;

    /**
     * メールアドレス
     */
    private String eMail;

    /**
     * 姓
     */
    private String lastName;

    /**
     * 名
     */
    private String firstName;

    /**
     * 権限名
     */
    @Enumerated(EnumType.STRING)
    private RoleName roleName;

    /**
     * 最終更新者
     */
    private String lastUpdateUserId;

    /**
     * 登録日時
     */
    private String insertTimestamp;

    /**
     * 更新日時
     */
    private String updateTimestamp;


    /**
     * ユーザーIDを返す
     *
     * @return ユーザーID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * ユーザーIDをセットする
     *
     * @param userId ユーザーID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * パスワードを取得する
     *
     * @return パスワード
     */
    public String getPassword() {
        return password;
    }

    /**
     * パスワードをセットする
     *
     * @param password パスワード
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * メールアドレスを返す
     *
     * @return メールアドレス
     */
    public String geteMail() {
        return eMail;
    }

    /**
     * メールアドレスをセットする
     *
     * @param eMail メールアドレス
     */
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    /**
     * 姓を返す
     *
     * @return　姓
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 名を返す
     *
     * @param lastName 姓
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * 名を返す
     *
     * @return 名
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 名をセットする
     *
     * @param firstName 名
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * 権限名を返す
     *
     * @return 権限名
     */
    public RoleName getRoleName() {
        return roleName;
    }

    /**
     * 最終更新者を返す
     *
     * @return 最終更新者
     */
    public String getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    /**
     * 最終更新者を返す
     *
     * @param lastUpdateUserId 最終更新者
     */
    public void setLastUpdateUserId(String lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    /**
     * 登録日時を返す
     *
     * @return 登録日時を返す
     */
    public String getInsertTimestamp() {
        return insertTimestamp;
    }

    /**
     * 登録日時をセットする
     *
     * @param insertTimestamp 登録日時
     */
    public void setInsertTimestamp(String insertTimestamp) {
        this.insertTimestamp = insertTimestamp;
    }

    /**
     * 更新日時を返す
     *
     * @return 更新日時
     */
    public String getUpdateTimestamp() {
        return updateTimestamp;
    }

    /**
     * 更新日時をセットする
     *
     * @param updateTimestamp 更新日時
     */
    public void setUpdateTimestamp(String updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
    }
}
