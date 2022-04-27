# __init__.py is a special file executed when import files from models directory

# here after, anybody can import Product from models itself
# . represent current directory
from .product import Product
print ("models __init__ called")