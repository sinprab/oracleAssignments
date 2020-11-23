#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: oracleAssignment
  
  @Assignment1
  Scenario: Oracle Docker Hub Assignmnet
    Given User Opens Docker Hub Search Page
     Then user lands in the Containers tab by default
      And there are two checkboxes under Images
      | Verified Publisher | 
      | Offcial Images     | 
      And under Categories following checkboxes are present
      | Analytics   | 
      | Base Images | 
      | Databases   | 
      | Storage     | 
     When user clicks the Verified Publisher checkbox
     Then filter Publisher Content is shown at the top of the content
     When user clicks Database checkbox
      And user clicks Base Images checkbox
     Then additional filters are shown at the top of the content
     When user clicks the close icon of the database filters
     Then corresponding checkbox in the left filter pane is also unchecked