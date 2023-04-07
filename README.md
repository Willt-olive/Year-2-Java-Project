# Year-2-Java-Project
Naive Bayes Assignment

Classes:
RunNaiveBayes -   this is the control class, its purpose is to call the naiveInterface class and run the program
naiveInterface -  this is the GUI class, its purpose is to give the user an interface they can interact with to select the parameters they want to run.
                  it is also the only way to run the naiveBayes class and the functions within like the main algorithm aswell as the self test feature.
naiveBayes -      this is the main class, its purpose is to read in a dataset, go through it, and calculate the liklihood of a person becoming and entrepreneur based on
                  the entries in the dataset. it also has the self test feature which splits up the dataset into to parts 70% ans 30% accordingly, and tests its own
                  accuracy by comparing the likelihood to itself to see the result.
                  
core functions -  reading in dataset -  which goes through the csv, splitting it up by "," and assigning a count to a variablebased on which row it is on.

                  getting liklihood -   using the data gathered in the reading, using math we can gather the likelihood of each event happening for both entrepreners
                                        and non entrepreneurs and this allows us to get the scores of each and based on which has the higher score its more likely to
                                        happen.
                                        
                  self test feature -   this is done in a similar way as the reading function but it is split up into 3 sections, first is a simple reading just to count
                                        the rows which can later be multiplied by a desired persentage,
                                        next is the exact same as reading the database but with the new size,
                                        finally is the comparison where it compares the likelihood to the actual answer to gauge how accurate.
                                        
                  getProbability -      this function takes in options and assigns them with the relative likelihoods which then calculated the overall score of both the
                                        likelihood of them becoming and not becoming an entrepreneur. the score which is higher is the one that has the higher liklihood,
                                        that is calculated by minusing one from the other, if the numeber left is positive its more likely to be an entrepreneur,
                                        if the number is negative they have a higher likelihood of not being an entrepreneur.
                                        
optional functionality -  do the training dynamically - as part of the core functionality built into the code was the likelihood function, this allows it to do all the
                                                        math regarding getting the scroes to be done without any hard codeing,
                                                        
                          added instances -             if iadded rows or "insrances" were added the code should still be able to run by itself as the reading fuction
                                                        uses a count feature to determin the lenght of the dataset aswell as to be a part of the calculations,
                                                        so if there were instances added the code will work as intended, in theory it should work better as more data
                                                        will lead to a more accurate likelihood.
                                                        
                          self test -                   as stated in the core functionality,  this features allows for the model to train on some of the dataset
                                                        and test itself on the remainder of the dataset so that it knows what percentage accuracy it has.



if i had more time -  a feature to maybe to add to the data set from the gui,
                      make it so that i could only enter one paramter and see the chances of that instead of needing all 5,
                      a nicer user interface,
                      more functionality to the interface.
