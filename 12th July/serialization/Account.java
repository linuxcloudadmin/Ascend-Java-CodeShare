import java.io.Serializable;
public class Account  implements Serializable{
int id;
String name;
double balance;
public Account(int id, String name, double balance) {
	super();
	this.id = id;
	this.name = name;
	this.balance = balance;
}
@Override
public String toString() {
	return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
}
}
