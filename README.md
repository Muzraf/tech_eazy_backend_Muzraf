To run:

mvn spring-boot:run

Normally it will run port 8080.
So, you can access with localhost:8080
I can't use port 80 right now.
To change port, you can configure the application.properties.

H2 database can be accessed with localhost:8080/h2-ui

API STRUCTURE

GET    localhost:8080/parcels       - lists all parcels
GET    localhost:8080/parcels/{id}  - list specific parcel
POST   localhost:8080/parcels       - create parcel
PUT    localhost:8080/parcels/{id}  - updats parcel
DELETE localhost:8080/parcels/{id}  - delete parcel

for PUT and POST, you have to give a body which should
be like this

{
	"customerName": "CUSTOMER_NAME",
	"parcelDeliveryAddress": "ADDRESS"
	"customerContactNumber": "NUMBER",
	"parcelWeight": "WEIGHT",
	"parcelWidth": "WIDTH",
	"parcelHeight": "HEIGHT"
}

the output will also be in the above format.
