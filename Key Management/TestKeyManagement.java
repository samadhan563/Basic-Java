package ordermanagement;

public class TestKeyManagement 
{

	public static void main(String[] args) 
	{
		KeyManagement k=new KeyManagement();
		k.inputKey();
		k.inputLocks();
		k.outPut();
		k.lockAssign();

	}

}
/*Output:::
Enter have How many number of keys
7
Enter 7 keys
101
102
103
104
105
101
102
Enter have How many number of locks
3
Enter 3 locks
d10
d20
d30
Total No Of Key in Bunch::7
No Of Locks ::3
Distinct Key
101
102
103
104
105
Distinct No Key count::5
Keys Available Each Key 
101
102
Keys Available Each Key count 2
Blank Keys 0
101
102
103
104
105
Keys Set=[101, 102, 103, 104, 105, 101, 102]
Locks Set=[d10, d20, d30]
Enter lock no for oppning from 0 to 2
Named as :: { 0 1 2  }
0
Enter key Number for oppning from 0 to 6
Named as :: { 0 1 2 3 4 5 6  }
5
Lock Is Opened
*/