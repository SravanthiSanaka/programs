package dto;

public class Accounts {
String acno;
String name;
String varchar;
Float balance;
public Accounts(String acno, String name, String varchar, Float balance) {
	super();
	this.acno = acno;
	this.name = name;
	this.varchar = varchar;
	this.balance = balance;
}
@Override
public String toString() {
	return "Accounts [acno=" + acno + ", name=" + name + ", varchar=" + varchar + ", balance=" + balance + "]";
}
public String getAcno() {
	return acno;
}
public void setAcno(String acno) {
	this.acno = acno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getVarchar() {
	return varchar;
}
public void setVarchar(String varchar) {
	this.varchar = varchar;
}
public Float getBalance() {
	return balance;
}
public void setBalance(Float balance) {
	this.balance = balance;
} 

}
