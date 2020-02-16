def URLify(str):
    
    return (str.strip()).replace(" ","%20")

if __name__ == "__main__":
    url = "Mr John Smith "
    print(URLify(url))

