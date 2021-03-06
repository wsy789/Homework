package com.wsy.exercise3;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;
@Entity
public class LoginBean {

        @Id    //表示是表中的主键
        private Long id; //一定是Long型
        private String userName;
        private String password;
        @Generated(hash = 883278132)
        public LoginBean(Long id, String userName, String password) {
            this.id = id;
            this.userName = userName;
            this.password = password;
        }
        @Generated(hash = 1112702939)
        public LoginBean() {
        }
        public Long getId() {
            return this.id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getUserName() {
            return this.userName;
        }
        public void setUserName(String userName) {
            this.userName = userName;
        }
        public String getPassword() {
            return this.password;
        }
        public void setPassword(String password) {
            this.password = password;
        }

}
