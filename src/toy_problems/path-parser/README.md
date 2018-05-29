# Path Parser

## Contextual Information
When writing web applications, it's common to have helpful information embedded into the *path* of the URL. For example, `myapp.com/1023864576/friends` includes something that appears to be a user ID, and we can reasonably conclude that if we visited that URL, we'd see a list of friends for whoever has User ID `1023864576`. When a user accesses this URL, thge `myapp.com` server knows to treat `1023864576` as a User ID, and fetches whatever data it needs to show that user's friends list.

Parsing URL paths and providing programmatic access to the data embedded in a URL is a common feature of routing libraries, such as [Compojure](https://github.com/weavejester/compojure/wiki/Routes-In-Detail) and [Bidi](https://github.com/juxt/bidi).

## Part One

### Your Goal
Write a function, `parse-path` that accepts *two strings*. The first string defines a URL *pattern*, in this syntax: `"/mypath/{id}/{other}"`. The second string is a *request url*, representing a user trying to access a URL that matches the *pattern*. The `parse-path` function should return a *map* in which the keys are the URL paramaters defined in the *pattern*, and their values are their corresponding portions of the *request url*. See the example usage below for clarification.


### Example Usage
```clojure
(parse-path "/mypath/{id}/{other}" "/mypath/123/whatever")
;;=> {:id    123
       :other "whatever"}


(parse-path "/inbox/{project-id}/tasks/{task-id}" "/inbox/2345/tasks/4567")
;;=> {:project-id 2345
       :tasks      4567}


(parse-path "inbox/{project-id}/tasks/{task-id}" "/inbox/2345")
;;=> java.lang.Exception: the route is not a match!
```

## Part Two

Now that we can parse paths, let's see if we can reverse the process!

### Your Goal
Write a function, `build-path`, that accepts a *string* and a *map*. The string will denote a *pattern* in the same format as the previous step. The map will be formatted in the same way as the output of your `parse-path` function from step one. The `build-path` function will return a *string* whose value is a valid URL that matches the given *pattern* and uses values from the *map*.


### Example Usage
```clojure
(build-path
  "/mypath/{id}/{other}"
  {:id    123
   :other whatever})
;;=> "/mypath/123/whatever"


(build-path
  "/inbox/{project-id}/tasks/{task-id}"
  {:project-id 2345
   :tasks      4567})
;;=> "/inbox/2345/tasks/4567"

(build-path
  "/inbox/{project-id}/tasks/{task-id}"
  {:project-id 2345})
;;=> java.lang.Exception: incorrect number of paramaters supplied!
```


## Problem Solving Process
Use these steps below to aid you in using the problem solving process.

#### Specification (define the rules to the problem)


#### Justificaiton (why would I call this function?)


#### Explanation (how does the input to the function relate to the output?)


#### Visualization (draw a plan that another engineer could understand and implement)


#### Approximation (translate your drawing of a plan into pseudocode)


#### Verification (use sample inputs and "be the machine" - interpreting your plan like code)


#### Implementation (translate your pseudocode into beautiful, simple clojure!)
