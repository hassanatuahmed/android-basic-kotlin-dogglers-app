/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.dogglers.adapter

import android.content.Context

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogglers.R

import com.example.dogglers.data.DataSource.dogs
import com.example.dogglers.model.Dog

/**
 * Adapter to inflate the appropriate list item layout and populate the view with information
 * from the appropriate data source
 */
class DogCardAdapter(
    private val context: Context?,
    private val layout: Int,
    private val dataset: List<Dog> = dogs
) : RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {

    // TODO: Initialize the data using the List found in data/DataSource

    /**
     * Initialize view elements
     * Test
     */
    class DogCardViewHolder(view: View?) : RecyclerView.ViewHolder(view!!) {
        // TODO: Declare and initialize all of the list item UI components
        val textViewName: TextView = view!!.findViewById(R.id.name)
        val textViewAge: TextView = view!!.findViewById(R.id.age)
        val textViewHobby: TextView = view!!.findViewById(R.id.hobby)
        val photo: ImageView = view!!.findViewById(R.id.photo)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        // TODO: Use a conditional to determine the layout type and set it accordingly.
        //  if the layout variable is Layout.GRID the grid list item should be used. Otherwise the
        //  the vertical/horizontal list item should be used.

        // TODO Inflate the layout

        // TODO: Null should not be passed into the view holder. This should be updated to reflect
        //  the inflated layout.


//     val layoutType = if(viewType == 3){
//         LayoutInflater.from(parent.context).inflate(R.layout.grid_list_item,false)
//     }else {
//         LayoutInflater.from(parent.context).inflate(R.layout.vertical_horizontal_list_item,false)
//
//     }
//
//        return  DogCardViewHolder(layoutType)
        val layoutType = when (layout) {
            com.example.dogglers.const.Layout.GRID -> {
                R.layout.grid_list_item
            }
            else -> {
                R.layout.vertical_horizontal_list_item
            }
        }
        val adapt = LayoutInflater.from(parent.context).inflate(layoutType, parent, false)
        return DogCardViewHolder(adapt)
    }

    override fun getItemCount(): Int =
        dataset.size// TODO: return the size of the data set instead of 0

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        val dog = dataset[position]
        val resources = context?.resources

        // TODO: Get the data at the current position
        // TODO: Set the image resource for the current dog

        holder.photo.setImageResource(dog.imageResourceId)
        holder.textViewAge.text = dog.age
        holder.textViewName.text = dog.name
        holder.textViewHobby.text = dog.hobbies
        // TODO: Set the text for the current dog's name
        // TODO: Set the text for the current dog's age

        // TODO: Set the text for the current dog's hobbies by passing the hobbies to the
        //  R.string.dog_hobbies string constant.
        //  Passing an argument to the string resource looks like:
        //  resources?.getString(R.string.dog_hobbies, dog.hobbies)
    }
}

