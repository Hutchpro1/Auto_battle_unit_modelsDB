# Chicken-and-Egg-P3  Project Rubric

## Background

*This captures the expectations that we have for your team during the unit.
This is how we will evaluate whether you have demonstrated these expectations.*

## Instructions

*As a team, complete this rubric (everything except for the Appendix) by
answering the questions below. Each question should usually only require one or
two sentences, so please be brief. The remainder of expectations will be
evaluated by instructors, so you don’t need to write anything in the Appendix.
We want you to see the full set of expectations for transparency’s sake.*

## Deliverables

*Provide links to the following project deliverables:*

| Deliverable                                                          |Due Date                  | Date Completed |URL                               |
|----------------------------------------------------------------------|---                       |----------------|---                               |
| Team name                                                            |Sprint 1 Module 1         | July 11, 2022  |name:  Chicken and the Egg^3      |
| [Design Document - problem statement](design_document.md)            |Sprint 1 Module 2         | July 11, 2022  |https://github.com/BloomTechBackend/bd-team-project-chicken-and-the-egg-3                                  |
| [Team Charter](team_charter.md)                                      |Sprint 1 Module 3         | July 12, 2022  |https://github.com/BloomTechBackend/bd-team-project-chicken-and-the-egg-3                                  |
| [Design Document](design_document.md)                                |Sprint 1 Friday by 5pm    | July 14, 2022  |https://github.com/BloomTechBackend/bd-team-project-chicken-and-the-egg-3                                  |
| Project Completion (Feature Complete)                                |Sprint 3 Friday by 5pm    | July 29, 2022  |https://github.com/BloomTechBackend/bd-team-project-chicken-and-the-egg-3                                      |
| [Team Reflection](reflection.md)                                     |Sprint 4 Wednesday by 5PM | August 1, 2022 |https://github.com/BloomTechBackend/bd-team-project-chicken-and-the-egg-3/blob/main/project_documents/chicken_and_the_egg_3/reflection.md                                     |
| [Accomplishment Tracking (person 1)](accomplishment_tracking.md)     |Sprint 4 Wednesday by 5PM | August 2, 2022 |https://github.com/BloomTechBackend/bd-team-project-chicken-and-the-egg-3                                     |
| [Accomplishment Tracking (Pedro Linares](project_documents/AccomplishmentTracking/PedroLinares) |Sprint 4 Wednesday by 5PM | August 2, 2022 |https://github.com/BloomTechBackend/bd-team-project-chicken-and-the-egg-3                                   |
| [Accomplishment Tracking (person 3)](accomplishment_tracking.md)     |Sprint 4 Wednesday by 5PM | August 2, 2022 | https://github.com/BloomTechBackend/bd-team-project-chicken-and-the-egg-3                                    |
| [Accomplishment Tracking (person 4)](accomplishment_tracking.md)     |Sprint 4 Wednesday by 5PM | August 2, 2022 | https://github.com/BloomTechBackend/bd-team-project-chicken-and-the-egg-3                                    |
| Self Reflection (person 1)                                           |Sprint 4 Wednesday by 5PM |                |n/a (will be submitted via Canvas - "Wrap-up" section) |
| Self Reflection (person 2)                                           |Sprint 4 Wednesday by 5PM |                |n/a (will be submitted via Canvas - "Wrap-up" section) |
| Self Reflection (person 3)                                           |Sprint 4 Wednesday by 5PM |                |n/a (will be submitted via Canvas - "Wrap-up" section) |
| Self Reflection (person 4)                                           |Sprint 4 Wednesday by 5PM |                |n/a (will be submitted via Canvas - "Wrap-up" section) |

## Technical Learning Objectives

### API Design

**Design an API to meet the needs of your application.** Provide a link to the
definition for your endpoints (can be code/configuration, or can be
documentation). List one thing that your team learned about designing a good
API.

*Endpoint definition location:* <br />
https://l9h7z45xgk.execute-api.us-west-2.amazonaws.com/test1/characterendpoint
https://l9h7z45xgk.execute-api.us-west-2.amazonaws.com/test1/itemendpoint
*What we learned:*    <br /> 
Very important to plan Apis or result in many blockers to lambda functions. <br />
**Develop a service endpoint definition that uses complex inputs and outputs.**
Select one of your endpoints and list the operation’s input and output objects.
Under each, list its attributes.

*Endpoint:*    <br />  
https://l9h7z45xgk.execute-api.us-west-2.amazonaws.com/test1/characterendpoint
https://l9h7z45xgk.execute-api.us-west-2.amazonaws.com/test1/itemendpoint   <br />  
*Input object(s):*      

* attribute 1  <br />
* UnitModelTable   <br />
* ...

*Output object(s):*    <br />

* attribute 1  <br />
* ItemModelTable   <br />
* ...

**Given a user story that requires a user to provide values to a service
endpoint, design a service endpoint including inputs, outputs, and errors.**
Select one of your endpoints that accepts input values from a client. List the
error cases you identified and how the service responds in each case. Provide at
most 3 error cases.

| **Endpoint:**  |  ItemModelTable                    |
|----------------|---                  |
| **Error case** |**Service response** |
| Item not found |  Item not found                     |
| Unit not found |  Unit not found                   |
|                |                     |

**Develop a service endpoint definition that uses query parameters to determine
how results are sorted or filtered.** List at least one endpoint that allows
sorting or filtering of results. Which attribute(s) can be sorted/filtered on?

*Endpoint:*  
https://l9h7z45xgk.execute-api.us-west-2.amazonaws.com/test1/itemendpoint   <br />
*Attribute(s):*  

**Determine whether a given error condition should result in a client or server
exception.** List one client exception and one server exception that your
service code throws. List one condition in which this exception is thrown.

|                       | **Exception** | **One case in which it is thrown** |
|---	                |---------------|------------------------------------|
|**Client exception:**  | Wrong Item    | 	 WrongItemException               |
|**Service exception:** | Wrong unit	   | WrongUnitException  	              |

### DynamoDB Table Design

**Decompose a given set of use cases into a set of DynamoDB tables that provides
efficient data access.** List the DynamoDB tables in your project:

1. ItemModelTable
2. UnitModelTable
3. BoardTable


**Design a DynamoDB table key schema that allows items to be uniquely
identified.** Describe the primary key structure for your DynamoDB table with
the most interesting primary key. In a sentence or two, explain your choice of
partition/sort key(s).

1.

**Design the attributes of a DynamoDB table given a set of use cases.** List a
DynamoDB table with at least 3 attributes. List one relevant use case that uses
the attribute. In one sentence, describe why the attribute is included.

**Table name:**   <br />
ItemModelTable1<br />
**Attributes:**

|Attribute name | (One) relevant use case | attribute purpose |
|---            |-------------------------|-------------------|
| Spiked Belt              | AttackDamagedmod        | Attack            |
|Inspiring Banner               | attackSpeedMod                        | attack Speed      |
|               |                         |                   |
|               |                         |                   |
|               |                         |                   |

### DynamoDB Indexes

**Design a GSI key schema and attribute projection that optimizes queries not
supported by a provided DynamoDB table.** In one or two sentences, explain why
you created one of the GSIs that your project uses, including one use case that
uses that index.

**Table name:**<br />
ItemModelTable1<br />
**Table keys:**<br />
Hashkey<br />
**GSI keys:**<br />
Item name<br />
**Use case for GSI:**<br />
**Implement functionality that uses query() to retrieve items from a provided
DynamoDB's GSI.** List one of your use cases that uses `query()` on a GSI.

**Table name:**<br />
UnitModelTable2<br />
**Use case for `query()` on GDI:**
Get Unit characters <br />
## Soft(er) Outcomes

**Learn a new technology.** For each team member, list something new that that
team member learned:

| Team Member   | Something new the team member learned |   
|---------------|---------------------------------------|
| Pedro Linares | Learned cloudformation yaml files     |   
|               |                                       |     
|               |                                       |     
|               |                                       |     

**Identify key words to research to accomplish a technical goal | Use sources
like sage and stack overflow to solve issues encountered while programming.**
Give an example of a search term that your team might have used to find an
answer to a technical question/obstacle that your team ran into. List the
resource that you found that was helpful.

**Search terms:**      
**Helpful resource:**      

**Find material online to learn new technical topics.** List one resource that
your team found on your own that helped you on your project.

**Topic:**
Videos on cloudformation and yaml files

**Resource:**
Class old recordings on youtube

**Share what was worked on yesterday, the plan for today, and any blockers as a
part of a scrum standup.** In one or two sentences, describe what your team
found to be the most useful outcome from holding daily standups.

1. Very helpful to do daily meeting when it was possible to meet, helped in task and blockers.

