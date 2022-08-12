from email import header
import requests

headers = {
    
}


response = requests.get("https://clck.ru/V6Sg9")

print(response.text)
