#!/usr/bin/env python
# coding: utf-8

# # IDA: Assignment 1
# 
# ### Deadline: September 24 (until 23:59)
# 
# 
# **Instructions:** All answers should be provided in the notebook and then submitted to Moodle. Name of notebook should be in following format:
#  - Name_group_Assignment1.ipynb (ex. Harry_Potter_2009_Assignment1.ipynb). PLEASE, use exactly the **same format.**
#  - Try to use fewer cells for compilation (for example, you can use print for several answers, instead of printing each answer on a separate cell)
#  - **PLEASE:** submit only one jupyter notebook (no zip or csv files) and with your names as in the instruction. Ohterwise, there will be punishment of 10% from your assignment mark.
#  - **IMPORTANT NOTE:** you will get points only for correct answers, not for trials or wrong answers. Your notebook should run when we press **"Restart Kernel"** and then press **"Run All"**. We are going to check answers only after doing that. If your code do not compile and stops at any question, you will get zero for that question.

# ## Q1 (10%)
# Convert the string below to a list.

# In[1]:


list_q1 = "['bahandi','kfc', 'mcdonalds', 'salambro','hardees', 'burgerking', 'wendys']"


# In[2]:


# your code here


# ## Q2 (10%)
# Create a random list of one hundred 3 digit numbers with some selected seed. Save that list in variable list_q2. Then print elements, which are divisible by their corresponding index's last digit. Ignore index zero.
# 
# ***Hints:*** use library random.

# In[3]:


# your code here


# ## Q3 (10%)
# Write a function that calculates the Euclidean distance between two n-dimensional points. The function should take two lists as arguments, where each list contains the n coordinates of each of the two points. 
# 
# If input parameters have the different size, your function should raise an error or warning.
# 
# Test your function for the points [0, 3, 0] and [4, 0, 0].
# 
# ***Hints:*** You can read about the definition of Euclidean distance on [Wikipedia](https://en.wikipedia.org/wiki/Euclidean_distance).

# In[4]:


# your code here


# ## Q4 (20%)
# Write a function that estimates the centroid of a collection of n-dimensional points. The function should take one list as an argument, which contains each of the points entered as a list of n coordinates. The function should return a list with the coordinates of the virtual center point.
# 
# Test your function for the points in `test_q3` entered below.
# 
# ***Hints:***  The coordinate of the centroid in each dimension is the mean of the coordinates of all the points in that dimension. Also, you might need some other libraries to calculate mean.

# In[5]:


# your code here


# ## Q5 (20%)
# Write a function that takes a list as an input and allocates its elements to different list depending on their datatypes. There should be separate list for strings, booleans, float, but for integers there should seperate lists based on number of digits in the list. Also, lists should be ordered in ascending order.
# 
# For example, if you have list [3,1,2, 4.5, 12, 15, 10, 19, 'hot', 'dog', True] as input, your function should return the following result: ['hot','dog'],[True],[4.5],[1,2,3],[10,12,15,19].

# In[6]:


# your code here


# ## Q6 (30%)
# Write a universal function that calculates an area of the triangle based on different methods of calculation. Design your function as following:
# 1. It should take several parameters: method,a,b,c,h,angle,r,R (a,b,c - triangle sides, angle - angle between two sides, r - inner circle radius, R - outer circle radius). 
# 2. Depending on the method it should look for necessary parameters. If for the selected method there is not enough parameters provided, it should raise some warning or error. If for the selected method there is more parameters provided than needed, just use only those that are needed (it is ok).
# 3. In your solution decide which parameters always needs to be provided, and which are not always necessary. 
# 
# *Use following triangle area calculation methods:* https://www.webmath.ru/poleznoe/formules8.php
# 
# *Use the following method names:*
# * with height
# * with angle
# * inner radius
# * outer radius 
# * heron
# 
# ***Note:*** you should not use libraries with predefined triangle area formulas.

# In[7]:


# your code here


# ---
# 
# ### Evaluation (Keep it!)
# 
# | Question | Mark     | Comment   
# |:-------:|:--------:|:----------------------
# | 1       |   10/10    |     
# | 2       |   10/10     | 
# | 3       |   10/10     | 
# | 4       |   20/20     | 
# | 5       |   20/20   | 
# | 6       |   30/30    | 
# |**Total**|**100/100**  | 
# 
