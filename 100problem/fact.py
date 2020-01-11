def fact(x):
	temp=1;
	while x>0:
		
		temp=temp*x;

		x=x-1;
	return temp

x=int(raw_input("Enter some value"))
print("factorial of {} is :".format(x),fact(x))	

