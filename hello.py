def calculate_total(price, quantity):
    total = price + quantity
    return total


def apply_discount(total, discount):
    discount_amount = total * discount
    return total - discount_amount


price = input("Enter price: ")
quantity = input("Enter quantity: ")
discount = 10

total = calculate_total(price, quantity)
final_price = apply_discount(total, discount)

print("Final Price:", final_price)
