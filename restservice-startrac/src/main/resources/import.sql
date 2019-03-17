INSERT INTO "TRUCK" (ID, LICENCE_PLATE) VALUES(1, 'WBD-761');
INSERT INTO "TRUCK" (ID, LICENCE_PLATE) VALUES(2, 'FKH-353');
INSERT INTO "TRUCK" (ID, LICENCE_PLATE) VALUES(3, 'ECH-907');

INSERT INTO "UNIT_OF_MEASUE" (ID, DESCRIPTION) VALUES(1, 'Unit1');
INSERT INTO "UNIT_OF_MEASUE" (ID, DESCRIPTION) VALUES(2, 'Unit2');
INSERT INTO "UNIT_OF_MEASUE" (ID, DESCRIPTION) VALUES(3, 'Unit3');

INSERT INTO "CATEGORY" (ID, DESCRIPTION) VALUES(1, 'Category1');
INSERT INTO "CATEGORY" (ID, DESCRIPTION) VALUES(2, 'Category2');
INSERT INTO "CATEGORY" (ID, DESCRIPTION) VALUES(3, 'Category3');

INSERT INTO "SHIPMENT" (ID, AMOUNT, SHIPMENT_NUMBER,TRUCK_ID,UNIT_OF_MEASUE_ID) VALUES (1,1000,'ShNum1100',1,2);
INSERT INTO "SHIPMENT" (ID, AMOUNT, SHIPMENT_NUMBER,TRUCK_ID,UNIT_OF_MEASUE_ID) VALUES (2,2500,'ShNum1101',1,3);
INSERT INTO "SHIPMENT" (ID, AMOUNT, SHIPMENT_NUMBER,TRUCK_ID,UNIT_OF_MEASUE_ID) VALUES (3,50000,'ShNum1102',2,1);
INSERT INTO "SHIPMENT" (ID, AMOUNT, SHIPMENT_NUMBER,TRUCK_ID,UNIT_OF_MEASUE_ID) VALUES (4,20000,'ShNum1103',3,1)

INSERT INTO "SHIPMENT_CATEGORY" (ID,CATEGORY_ID,SHIPMENT_ID) VALUES (1,2,1);
INSERT INTO "SHIPMENT_CATEGORY" (ID,CATEGORY_ID,SHIPMENT_ID) VALUES (2,3,1);
INSERT INTO "SHIPMENT_CATEGORY" (ID,CATEGORY_ID,SHIPMENT_ID) VALUES (3,1,2);
INSERT INTO "SHIPMENT_CATEGORY" (ID,CATEGORY_ID,SHIPMENT_ID) VALUES (4,1,3);
INSERT INTO "SHIPMENT_CATEGORY" (ID,CATEGORY_ID,SHIPMENT_ID) VALUES (5,3,3);


