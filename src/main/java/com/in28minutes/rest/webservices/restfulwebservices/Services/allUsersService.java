package com.in28minutes.rest.webservices.restfulwebservices.Services;

import java.util.ArrayList;
import java.util.Date;

import com.in28minutes.rest.webservices.restfulwebservices.POJOS.Todo;

import org.springframework.stereotype.Service;

@Service
public class allUsersService {

    private static ArrayList<Todo> allusers=new ArrayList<Todo>();
    private static int uid=0;

    static{
        allusers.add(new Todo(++uid,"user1","Learn Java",new Date(),false));
        allusers.add(new Todo(++uid,"user2","Learn Spring",new Date(),false));
        allusers.add(new Todo(++uid,"user3","Learn CP",new Date(),false));
        allusers.add(new Todo(++uid,"user4","Learn Dsa",new Date(),false));
    }
    public ArrayList<Todo> getAllUsers()
    {
        return allusers;
    }

    public Todo deleteById(int uid)
    {
        Todo t=findById(uid);
        allusers.remove(t);
        return t;
    }

    public Todo findById(int id2) {
        for(Todo t:allusers)
        {
            if(t.getId()==id2)
            {
                return t;
            }
        }
        return null;
    }
    public Todo save(Todo todo)
    {
        if(todo.getId()==-1 || todo.getId()==0)
        {
            todo.setId(++uid);
            allusers.add(todo);
        }
        else
        {
            deleteById(todo.getId());
            allusers.add(todo);
        }
        return todo;
    }
    
}
