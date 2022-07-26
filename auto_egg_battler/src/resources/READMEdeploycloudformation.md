


example below 

Phase 0 is complete when:
- `Recipes` table exists in your AWS account with some sample data
- You understand the `Recipes` table attributes for the sample items in the table

## Phase 1: Implement `Cartons` table

Now create the `Cartons` table to manage the `Carton`s that `IceCreamParlorService` uses.
The table has already been designed in `./resources/Cartons-tabledesign.txt`.

You need to:
1. Create a new file `cloudformation/dynamodbtabledesign/CartonsTable.yaml` with your
   CloudFormation definition of the `Cartons` table.
* If using `RecipesTable.yaml` as a guide, remove the line starting with `LambdaRole:` and every
  line below it.
    * (The other resources for populating the `Recipes` table with sample items, but you can add items to
      `Cartons` manually to test your table.)
    * if you want practice later, you could try to re-add the relevant lines of the cloud formation
      template to populate sample data (delete the table from DynamoDB first, then rerun the `aws`
      command)
1. Deploy your new table to your AWS account by running
   ```
   aws cloudformation create-stack --region us-west-2 --stack-name dynamodbtabledesign-cartonstable01 --template-body file://cloudformation/dynamodbtabledesign/CartonsTable.yaml --capabilities CAPABILITY_IAM
   ```
1. Confirm your table is provisioned matching the design provided.
1. Create a sample Carton item in your table using the DynamoDB Console. Be sure to use
   the attributes specified in the design file

**GOAL:** `Cartons` table CloudFormation definition is written and deployed to your AWS account.




*** Deploy 
Chicken and the  egg below 

 ```
   unit model below
 aws cloudformation create-stack --region us-west-2 --stack-name dynamodbtabledesign-ChickenAndEgg-unitmodel01 --template-body file://cloudformation/unit_model_table.yaml --capabilities CAPABILITY_IAM


item model below
 aws cloudformation create-stack --region us-west-2 --stack-name dynamodbtabledesign-ChickenAndEgg-itemmodel01 --template-body file://cloudformation/item_model_table.yaml --capabilities CAPABILITY_IAM


current unit model below
 aws cloudformation create-stack --region us-west-2 --stack-name dynamodbtabledesign-ChickenAndEgg-currentunitmodel01 --template-body file://cloudformation/current_unit_model_table.yaml --capabilities CAPABILITY_IAM


board model below
 aws cloudformation create-stack --region us-west-2 --stack-name dynamodbtabledesign-ChickenAndEgg-boardmodel01 --template-body file://cloudformation/board_model_table.yaml --capabilities CAPABILITY_IAM


   
   
   ```