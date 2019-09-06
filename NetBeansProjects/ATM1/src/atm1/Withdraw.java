/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm1;

/**
 *
 * @author user pc
 */

public class Withdraw extends ATMMachine
{
    static double withdraw = 0;   
    public void setWithdraw(double w)
    {
        withdraw = w;
    }
    public static double getWithdraw()
    {
        return withdraw;
    }
}
