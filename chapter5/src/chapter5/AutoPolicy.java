/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*(Modified AutoPolicy Class) Modify class AutoPolicy in Fig. 5.11 to validate the two-letter
state codes for the northeast states. The codes are: CT for Connecticut, MA for Massachusetts, ME
for Maine, NH for New Hampshire, NJ for New Jersey, NY for New York, PA for Pennsylvania
and VT for Vermont. In AutoPolicy method setState , use the logical OR ( || ) operator
(Section 5.9) to create a compound condition in an if ... else statement that compares the method’s
argument with each two-letter code. If the code is incorrect, the else part of the if ... else statement
should display an error message.*/
package chapter5;

/**
 *
 * @author claude
 */
public class AutoPolicy {
    private int accountNumber; 
private String makeAndModel; 
private String state; 

public AutoPolicy(int accountNumber, String makeAndModel, String state)
{
this.accountNumber = accountNumber;
this.makeAndModel = makeAndModel;
this.state = state;
}

public void setAccountNumber(int accountNumber)
{
this.accountNumber = accountNumber;
}

public int getAccountNumber()
{
return accountNumber;
}
// sets the makeAndModel
public void setMakeAndModel(String makeAndModel)
{
this.makeAndModel = makeAndModel;

}
public String getMakeAndModel()
{
return makeAndModel;
}
public void setState(String state)
{ if (state == "MA" || state == "NJ" || state == "NY" || state == "PA" || state == "CT" || state == "ME" || state == "NH" || state == "VT"){
this.state = state;
}
else{
    System.out.println("No such state exist");
}}

// returns the state
public String getState()
{
return state;
}

public boolean isNoFaultState()
{
boolean noFaultState;





switch (getState()) 
{
case "MA": case "NJ": case "NY": case "PA": case "CT": case "ME": case "NH": case "VT":
noFaultState = true;
break;
default:
noFaultState = false;
break;
}
return noFaultState;
}
}
