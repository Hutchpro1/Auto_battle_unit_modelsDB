# [Chicken and the Egg ^3] Design Document

## Auto Egg Battler Design

## 1. Problem Statement
We are trying to design a game using the auto battler format.


## 2. Top Questions to Resolve in Review
1. Deterministic logic for battles.   
2. Character movement.   
3. Stats Format for characters and what stats to include.
4. Setup For AI, then setup multiplayer
5. API calls backend.


## 3. Use Cases

U1. As an Auto Egg Battler player, I want to acquire characters and items when I
purchase them from the store.

U2. As an Auto Egg Battler player, I want to be able to place my characters on the board, 
and to move them from one place on the board to another.
    
U3. As an Auto Egg Battler player, I want to be able to place items on my characters.

u4. As an Auto Egg Battler player, I want to be able to run the battle simulation when I am ready.

U5. As an Auto Egg Battler player, I want to be able to sell items and characters in the store.
(possible trade system)

U6. As an Auto Egg Battler player, I want to be able to win the game or quit when I don't.

## 4. Project Scope

*Clarify which parts of the problem you intend to solve. It helps reviewers know
what questions to ask to make sure you are solving for what you say and stops
discussions from getting sidetracked by aspects you do not intend to handle in
your design.*

### 4.1. In Scope

*Which parts of the problem defined in Sections 1 and 2 will you solve with this
design?*
1. Single player 
2. Buy and sell Characters and items.
3. Move Characters and assign items.
4. Start battles.
5. Default enemy teams with different levels of difficulty.
6. Character statistics.
7. Item statistics.
8. client retrieval of data for battles.
9. saving team compositions levels.

### 4.2. Out of Scope

*Based on your problem description in Sections 1 and 2, are there any aspects
you are not planning to solve? Do potential expansions or related problems occur
to you that you want to explicitly say you are not worrying about now? Feel free
to put anything here that you think your team can't accomplish in the unit, but
would love to do with more time.*

1. multiplayer.
2. trading items and characters.
3. player health pool.
4. persistent battles.
5. character animations.
6. character assets.
7. player login.
8. ranking system.
9. battle pass.
10. skins for boards and player.

# 5. Proposed Architecture Overview

*Describe broadly how you are proposing to solve for the requirements you
described in Section 2.*

*This may include class diagram(s) showing what components you are planning to
build.*

*You should argue why this architecture (organization of components) is
reasonable. That is, why it represents a good data flow and a good separation of
concerns. Where applicable, argue why this architecture satisfies the stated
requirements.*

# 6. API

## 6.1. Public Models

*Define the data models your service will expose in its responses via your
*`-Model`* package. These will be equivalent to the *`PlaylistModel`* and
*`SongModel`* from the Unit 3 project.*

## 6.2. *First Endpoint*

*Describe the behavior of the first endpoint you will build into your service
API. This should include what data it requires, what data it returns, and how it
will handle any known failure cases. You should also include a sequence diagram
showing how a user interaction goes from user to website to service to database,
and back. This first endpoint can serve as a template for subsequent endpoints.
(If there is a significant difference on a subsequent endpoint, review that with
your team before building it!)*

*(You should have a separate section for each of the endpoints you are expecting
to build...)*

## 6.3 *Second Endpoint*

*(repeat, but you can use shorthand here, indicating what is different, likely
primarily the data in/out and error conditions. If the sequence diagram is
nearly identical, you can say in a few words how it is the same/different from
the first endpoint)*

# 7. Tables

*Define the DynamoDB tables you will need for the data your service will use. It
may be helpful to first think of what objects your service will need, then
translate that to a table structure, like with the *`Playlist` POJO* versus the
`playlists` table in the Unit 3 project.*

# 8. Pages

*Include mock-ups of the web pages you expect to build. These can be as
sophisticated as mockups/wireframes using drawing software, or as simple as
hand-drawn pictures that represent the key customer-facing components of the
pages. It should be clear what the interactions will be on the page, especially
where customers enter and submit data. You may want to accompany the mockups
with some description of behaviors of the page (e.g. “When customer submits the
submit-dog-photo button, the customer is sent to the doggie detail page”)*