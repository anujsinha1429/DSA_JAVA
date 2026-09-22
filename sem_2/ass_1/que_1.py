def generate_bill(item,price,quantity=1,discount=0,tax_rate=0.05):
    total=price*quantity
    discount_amount= total*(discount/100)
    discount_amount= total-discount_amount
    tax_amount=discount_amount*tax_rate
    final_amount=discount_amount+tax_amount
    print(f"item: {item} price: {price:.2f} rs quantity: {quantity} discount: {discount} tax: {tax_rate} final amount: {final_amount:.2f} rs")

generate_bill("Apple", 50000)
generate_bill("banana",50000,10)
generate_bill("Apple", 50000,discount=10,tax_rate=0.18)
generate_bill("Apple", 50000,2,10,0.05)
