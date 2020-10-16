# INFO5100_Zhao_Xi_001054333
Two additional extensions to think about are how to model a ride from a to b and determine the current location of vehicles.   
Write a brief explanation of your ideas.   
Implementation is not required.  

Explanation:  
1.The model a ride of A and B can be a path of point A and point B in a matrix.  
Get the two points' location and set the initial unit movement, and then the ride would be the movement from point A to point B.  
2. In order to determin the current location, it should leverage reference near the location. Just like the metrix, the reference is the origin point(0,0).  
So we can create a reference point and determin the current location by measure how far it is from the reference.
