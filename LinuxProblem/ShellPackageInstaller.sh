#!/bin/bash

size=$(jq '.Dependencies|length' input.json)

for((i=0; i<size; i++));
do
  var=$(jq -r '.Dependencies['$i']' input.json)
  pip install $var
done
