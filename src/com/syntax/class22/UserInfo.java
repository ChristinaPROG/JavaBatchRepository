package com.syntax.class22;


    public class UserInfo extends UserClass {
        String userAddress;
        UserInfo(String liya,String name, String mobile, String address) {
            super(name, mobile);
            this.userAddress = address;
        }

        public UserInfo(String liya, String s, String s1) {
            super ( );
        }

        void userDetails() {
            System.out.println("User name is "
                    + super.getName() + " has a phone number "
                    + super.getMobileNumber() + " and lives in "
                    + userAddress);
        }
        public static void main(String[] args) {
            UserInfo userInfo = new UserInfo("Liya",
                    "38237173913","Brooklyn, NY");
            userInfo.userDetails();


            UserInfo userInfo1 = new UserInfo("Mike",
                    "38237156413","Brooklyn, NY");
            userInfo.userDetails();
        }
    }

