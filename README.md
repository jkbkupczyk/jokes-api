# jokes-api
Get your daily dose of Jokes 🃏

# `Joke` Model

A single joke (may be bad).

| Key               | Type          | Description |
| ----------------- | ------------- | ----------- |
| id                | Long          | Unique ID for the `Joke`  |
| type              | String        | Type of `Joke` ex. riddle |
| question          | String        | First part of the joke    |
| answer            | String        | The answer aka. the second part of the joke |
| lang              | String        | Language in which joke is |

## `Joke` endpoints

Base URL for all endpoints: https://daily-jokes.herokuapp.com/api

### Get random `Joke`

##### Endpoint
`GET /api`

##### Example request
`GET /api`

##### Example response
```json
{
    "id": 171,
    "type": "riddle",
    "question": "I have teeth but can’t eat. What am I?",
    "answer": "A comb",
    "lang": "en"
}
```

---

### Get all jokes

| Parameter   | Type                   | Default | Limit | Description    |
| ----------- | ---------------------- | ------- | ----- | ---------------|
| lang        | String                 |    1    | N/A   | NONE           |
| type        | String                 |    1    | N/A   | NONE           |

### Endpoint
`GET /api/jokes`

##### Example requests
`GET /api/jokes`

##### Example response
```
{
    [
        {
            "id": 1,
            "type": "riddle",
            "question": "Why do most married men die before their wives?",
            "answer": "Because they want to",
            "lang": "en"
        },
        {   
            "id": 2,
            "type": "riddle",
            "question": "What do diapers and Politicians have in common?",
            "answer": "They both need changing regularly - for exactly the same reason",
            "lang": "en"
        },
        { ... } //More objects...
    ]
}
```

---

### Get `Joke` by its ID

### Endpoint
`GET /api/jokes/:id`

##### Example request
`GET /api/jokes/69`

##### Example response
`GET /api/jokes/69`

```json
{
    "id": 69,
    "type": "riddle",
    "question": "What is the best definition of a mixed emotion?",
    "answer": "Watching the mother-in-law reverse off a cliff driving your brand new car",
    "lang": "en"
}
```


---

### Get queried jokes

These are `Joke` queried with query params.

##### Endpoint
`GET /jokes/`

##### Query parameters

| Parameter   | Type                   | Default | Limit | Description    |
| ----------- | ---------------------- | ------- | ----- | ---------------|
| NONE        | NONE                   |    1    | NONE  | NONE           |

##### Returns
An array of `Jokes` or singular Joke that the user has specified by query params.

##### Example request
`GET /api/jokes?type=riddle`
`GET /api/jokes?lang=en`
`GET /api/jokes?lang=riddle?lang=en`
`GET /api/jokes?lang=en,pl,es,de`

##### Example response

```json
[
    {
        "id": 12,
        "type": "riddle",
        "question": "How you know that you are flying with a 'no frills' airline?",
        "answer": "You need to have the correct change to board the plane",
        "lang": "en"
    },
    {
        "id": 13,
        "type": "riddle",
        "question": "Why do 'no frills' airlines never show movies on their flights?",
        "answer": "They don’t need to. You keep seeing your life flashing before your very eyes",
        "lang": "en"
    }
]
```

---

### Get information about jokes in api

### Endpoint
`GET /api/jokes/info`

##### Example request
`GET /api/jokes/info`

##### Example response
```json
{
    "totalJokes": 194
}
```

---


| Parameter   | Type                   | Default | Limit | Description    |
| ----------- | ---------------------- | ------- | ----- | ---------------|
| NONE        | NONE                   |    1    | NONE  | NONE           |
