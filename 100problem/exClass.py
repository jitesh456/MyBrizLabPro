class First:

	def _init_(self):
		self.s=""
	def setString(self):
		self.s=raw_input("enter name")
	def getString(self):
		print (self.s)


obj=First()
obj.setString()
obj.getString()		
		
		