import riak

# python 3.5

# łączenie się z bazą
myClient = riak.RiakClient(pb_port=8087, protocol='pbc')

myBucket = myClient.bucket('23098')

# tworzenie dokumentu
marleen = {'user_name': 'marleenmgr',
           'full_name': 'Marleen Manager',
           'email': 'marleen.manager@riak.com'} 

key1 = myBucket.new('one', data=marleen)
key1.store()  # zapis do bazy
fetched1 = myBucket.get('one') # pobieranie
print(fetched1.data) # wyświetlanie
fetched1.data["full_name"] = "Pity" # modyfikacja
fetched1.store()
fetched1 = myBucket.get('one').data # pobieranie
print(fetched1) # wyświetlanie
fetched1 = myBucket.get('one') # pobieranie
fetched1.delete() # usunięcie
fetched1 = myBucket.get('one') # pobieranie
print(fetched1.data) # wyświetlanie