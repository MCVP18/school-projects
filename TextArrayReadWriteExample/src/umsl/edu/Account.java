/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umsl.edu;

/**
 *
 * @author New
 */
public class Account
    {

        private double balance;
        private String acctNum;



        public Account(double bal)
            {

                balance = bal;

            }

        public double getBalance()

            {

                return balance;

            }

        public void setBalance(double balance)

            {

                this.balance = balance;

            }

        public String getAcctNum()

            {

                return acctNum;

            }

        public void setAcctNum(String acctNum)

            {

                this.acctNum = acctNum;

            }

}
