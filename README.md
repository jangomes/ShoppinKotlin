#JANAINA GOMES DA SIVA - 21944
# 21944_janaina_APP_CA4
Mobile APP CA4 - Janaina Gomes


This repository contains a shopping application for student Janaina as part of Dorset College BSc Year 2 BSc Year 2 assignment CA4

Requirements Checklist:


[x] - Main Activity (or Launcher Activity)

[x] - Button Links open new Activity

[ ] - Exit Button finishes the activity and closes the app

[ ] - Text is not hardcoded in the layout but is present in "strings" resources xml file

[x] - Image Assets

[x] - Images (Raster) are used

[x] - Vector icons (inbuilt material icons) are used

[x] - SVG icon is used

Layout and Design Requirements:

1 - Authentication

[x] - Allow User to Signup

[x] - Log In using username and password

[x] - Store userID once logged in to keep the user logged in (even after restarting the app)


2 - Product Listing

[x] - List Product Categories

[x] - On clicking a Category, list Products in that Category

[] - On clicking a Product, show Product description, show buy button and controls to change quantity.


3 - Cart

[] - Show cart summary

[] - Show total amount

[] - Purchase button to place an order, show order notification


4 - Show order history

[] - List users orders

[] - On clicking an Order, show Order details and Products ordered

[] - On clicking a Product, take them to Product description page created for 3.3


5 - Show User details

[] - Use the stored userID to show user details

[] - Show a random circular profile image from https://thispersondoesnotexist.com/

[] - Show Logout button, on click take back to Signup / Log In page (Restart should not auto login after logout)


6 - UI/Implementational Requirements

[] - RecyclerView used for all Lists: Categories, Products, Orders

[] - ViewPager2 with bottom TabLayout for: Shop, Cart, Orders, Profile icons

[] - If logged in, attach authentication token to all requests until logout

[] - Add a small "About this app" button in the profile page, that shows a page on click with your copyright details and credits


Bonus:

Show a map fragment based on the GPS co-ordinates (Hint: Follow instructions given here) in the user profile

Report:

Developing this application, I followed what was presented in class 


References:

Report:

Developing this application, I basically followed what was presented in class, most of the code was directly created based on the explanations provided by the teacher. During the creation process I had some difficulties and could not finish the project. I couldn't get the cart to work and so I couldn't show the orders. The first part of the project was carried out following the orientation of the video on youtube to perform the login and signin, the second part of the categories, products was carried out following the guidelines in class. The information for the second part is received from fakestoreapi.com. The first part of the project can be found at https://github.com/jangomes/21944_janaina_APP_CA4 I did something wrong which led me to have two repositories for the same project but the final project is located at https://github.com/ jangomes/ShoppinKotlin. In conclusion, I can say that I learned a lot, but I still have a lot to learn because I can't meet all the requirements.

References:

App close button: Amaro, G., 2013. Como criar botão para sair / fechar aplicação (Android). [online] Spigando e Aprendendo. Available at: https://spigandoeaprendendo.wordpress.com/2013/06/28/como-criar-botao-para-sair-fechar-aplicacao-android/ [Accessed 3 March 2022].

information about fakestoreapi: Keikavousi M, unknown. Fake store rest API for your e-commerce or shopping website prototype. Available at:
https://fakestoreapi.com/

Login and LogOut:tutorialsEU, by Denis,2020. Android Google Firebase Firestore 7 Hours Course - Build a Shop App using Kotlin. Available at:
https://www.youtube.com/watch?v=hoK9OOP1KZw

Lifecycle: Code Palace, 2020. The Lifecycle Component Tutorial in Android Studio (Kotlin). [image] Available at: https://www.youtube.com/watch?v=INauhIIoQ_s [Accessed 3 March 2022].

Creating a radius corner: Smartherd, 2020. Shape your Image with Circle, Rounded Square, Cuts at corner. Shapeable ImageView in Android Studio. [image] Available at: https://www.youtube.com/watch?v=jihLJ0oVmGo [Accessed 2 March 2022].

Photos used from: Unsplash, 2022. Photos Unsplash. [image] Available at: https://unsplash.com/ [Accessed 3 March 2022].
