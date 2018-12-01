/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

/**
 *
 * @author claude
 */
public class AutoPolicyTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create two AutoPolicy objects
AutoPolicy policy1 =
new AutoPolicy(11111111, "Toyota Camry", "NJ" );
AutoPolicy policy2 =
new AutoPolicy(22222222, "Ford Fusion", "MP" );


// display whether each policy is in a no-fault state

policyInNoFaultState(policy1);
policyInNoFaultState(policy2);
}
// method that displays whether an AutoPolicy
// is in a state with no-fault auto insurance
public static void policyInNoFaultState(AutoPolicy policy)
{
System.out.println("The auto policy:");
System.out.printf(
"Account #: %d; Car: %s; State %s %s a no-fault state%n%n",
policy.getAccountNumber(), policy.getMakeAndModel(),
policy.getState(),
(policy.isNoFaultState() ? "is": "is not") );
}
    }
    

